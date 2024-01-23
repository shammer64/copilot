import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void testCalculateDaysBetweenDates_sameDates() {
        Main main = new Main();
        Date date = new Date();
        assertEquals(0, main.calculateDaysBetweenDates(date, date));
    }

    @Test
    public void testCalculateDaysBetweenDates_differentDates() {
        Main main = new Main();
        Date startDate = new Date();
        Date endDate = new Date(startDate.getTime() + TimeUnit.DAYS.toMillis(3));
        assertEquals(3, main.calculateDaysBetweenDates(startDate, endDate));
    }

    @Test
    public void testCalculateDaysBetweenDates_startDateAfterEndDate() {
        Main main = new Main();
        Date startDate = new Date();
        Date endDate = new Date(startDate.getTime() - TimeUnit.DAYS.toMillis(3));
        assertEquals(-3, main.calculateDaysBetweenDates(startDate, endDate));
    }

    @Test
    public void testCalculateDaysBetweenDates_nullDates() {
        Main main = new Main();
        Date date = new Date();
        assertThrows(IllegalArgumentException.class, () -> main.calculateDaysBetweenDates(null, date));
        assertThrows(IllegalArgumentException.class, () -> main.calculateDaysBetweenDates(date, null));
        assertThrows(IllegalArgumentException.class, () -> main.calculateDaysBetweenDates(null, null));
    }

    @Test
    public void testCalculateSecondsSince_currentDate() {
        Main main = new Main();
        Date date = new Date();
        assertTrue(main.calculateSecondsSince(date) >= 0);
    }

    @Test
    public void testCalculateSecondsSince_pastDate() {
        Main main = new Main();
        Date date = new Date(new Date().getTime() - TimeUnit.SECONDS.toMillis(5));
        assertTrue(main.calculateSecondsSince(date) >= 5);
    }

    @Test
    public void testCalculateSecondsSince_futureDate() {
        Main main = new Main();
        Date date = new Date(new Date().getTime() + TimeUnit.SECONDS.toMillis(5));
        assertTrue(main.calculateSecondsSince(date) <= -5);
    }

    @Test
    public void testCalculateSecondsSince_nullDate() {
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.calculateSecondsSince(null));
    }

    @Test
    public void testCalculateSecondsSince_ScottsBirthdate() {
        Main main = new Main();
        GregorianCalendar calendar = new GregorianCalendar(1964, GregorianCalendar.SEPTEMBER, 1, 7, 14);
        Date date = calendar.getTime();
        assertThat(main.calculateSecondsSince(date)).isGreaterThan(1874217201L);
    }


}