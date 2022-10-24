package hu.herpaipeter;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class LeapYearTest {

    @Test
    void odd_number_is_not_leap_year() {
        LeapYear leap = new LeapYear();
        assertEquals(false, leap.check(1));
    }

    @Test
    void even_number_not_divideable_by_4_is_not_leap_year() {
        LeapYear leap = new LeapYear();
        assertEquals(false, leap.check(2002));
    }

    @Test
    void even_number_divideable_by_4_is_leap_year() {
        LeapYear leap = new LeapYear();
        assertEquals(true, leap.check(1996));
    }

    @Test
    void even_number_divideable_by_4_and_by_100_is_not_leap_year() {
        LeapYear leap = new LeapYear();
        assertEquals(false, leap.check(1900));
    }

    @Test
    void even_number_divideable_by_4_and_by_100_and_by_400_is_leap_year() {
        LeapYear leap = new LeapYear();
        assertEquals(true, leap.check(2000));
    }
}

