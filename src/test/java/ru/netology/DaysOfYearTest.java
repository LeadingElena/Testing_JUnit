package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DaysOfYearTest {
    @ParameterizedTest
    @CsvSource(value = {
            "400, 366, true",
            "2000, 366, true",
            "80, 366, true",
            "2001, 366, false",
            "2000, 365, false"
    })
    void validateDaysOfYearPrarmeterized(int year, int day, boolean expectedResult) {
        int correctDay = DaysOfYear.daysOfYear(year);
        boolean result = (correctDay == day);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void validateDaysOfYear() {
        final int year = 1980;
        final int day = 365;

        int correctDay = DaysOfYear.daysOfYear(year);
        boolean result = (correctDay == day);
        assertFalse(result);
    }

    @Test
    public void test_NumberFormatInput_throwsException() {
        final String inputYear = "vvv";
        assertThrows(NumberFormatException.class, () -> DaysOfYear.daysOfYear(Integer.parseInt(inputYear)));
    }
}
