package ru.dugarov;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilsTest {

    @Test
    void testFormatDate() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals("24.02.2024", DateTimeUtils.formatDate(date, "dd.MM.yyyy"));
    }

    @Test
    void testFormatDateWithInvalidPattern() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertThrows(IllegalArgumentException.class, () -> DateTimeUtils.formatDate(date, "invalid_pattern"));
    }

    @Test
    void testFormatDateWithNullDate() {
        assertThrows(NullPointerException.class, () -> DateTimeUtils.formatDate(null, "dd.MM.yyyy"));
    }

    @Test
    void testFormatDateWithNullPattern() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertThrows(NullPointerException.class, () -> DateTimeUtils.formatDate(date, null));
    }

    @Test
    void testDaysBetween() {
        LocalDate start = LocalDate.of(2024, 2, 20);
        LocalDate end = LocalDate.of(2024, 2, 24);
        assertEquals(4, DateTimeUtils.daysBetween(start, end));
    }

    @Test
    void testDaysBetweenSameDate() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals(0, DateTimeUtils.daysBetween(date, date));
    }

    @Test
    void testDaysBetweenWithNull() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertThrows(NullPointerException.class, () -> DateTimeUtils.daysBetween(null, date));
        assertThrows(NullPointerException.class, () -> DateTimeUtils.daysBetween(date, null));
    }


    @Test
    void testIsLeapYear() {
        assertTrue(DateTimeUtils.isLeapYear(2024));
        assertFalse(DateTimeUtils.isLeapYear(2023));
        assertTrue(DateTimeUtils.isLeapYear(2000)); // 2000 - високосный
        assertFalse(DateTimeUtils.isLeapYear(1900)); // 1900 - невисокосный
    }

    @Test
    void testAddDays() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals(LocalDate.of(2024, 2, 27), DateTimeUtils.addDays(date, 3));
    }

    @Test
    void testAddDaysWithNegative() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals(LocalDate.of(2024, 2, 21), DateTimeUtils.addDays(date, -3));
    }

    @Test
    void testAddDaysWithNull() {
        assertThrows(NullPointerException.class, () -> DateTimeUtils.addDays(null, 3));
    }

    @Test
    void testAddMonths() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals(LocalDate.of(2024, 5, 24), DateTimeUtils.addMonths(date, 3));
    }

    @Test
    void testAddMonthsWithNegative() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals(LocalDate.of(2023, 11, 24), DateTimeUtils.addMonths(date, -3));
    }

    @Test
    void testAddMonthsWithNull() {
        assertThrows(NullPointerException.class, () -> DateTimeUtils.addMonths(null, 3));
    }

    @Test
    void testAddYears() {
        LocalDate date = LocalDate.of(2024, 2, 24);
        assertEquals(LocalDate.of(2027, 2, 24), DateTimeUtils.addYears(date, 3));
    }

    @Test
    void testAddYearsWithNull() {
        assertThrows(NullPointerException.class, () -> DateTimeUtils.addYears(null, 3));
    }
}
