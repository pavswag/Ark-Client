import java.util.Date;
import java.util.TimeZone;

// 
// Decompiled by Procyon v0.5.36
// 

public class Calendar
{
    static final int au = 4;
    static final String[] DAYS_OF_THE_WEEK;
    static java.util.Calendar Calendar_calendar;
    static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
    
    Calendar() throws Throwable {
        throw new Error();
    }
    
    static {
        MONTH_NAMES_ENGLISH_GERMAN = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
        DAYS_OF_THE_WEEK = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        java.util.Calendar.getInstance();
        Calendar.Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
    
    public static String an(final long date) {
        Calendar.Calendar_calendar.setTime(new Date(date));
        final int value = Calendar.Calendar_calendar.get(7);
        final int value2 = Calendar.Calendar_calendar.get(5);
        final int value3 = Calendar.Calendar_calendar.get(2);
        final int value4 = Calendar.Calendar_calendar.get(1);
        final int value5 = Calendar.Calendar_calendar.get(11);
        final int value6 = Calendar.Calendar_calendar.get(12);
        final int value7 = Calendar.Calendar_calendar.get(13);
        return Calendar.DAYS_OF_THE_WEEK[value - 1] + ", " + value2 / 10 + value2 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][value3] + "-" + value4 + " " + value5 / 10 + value5 % 10 + ":" + value6 / 10 + value6 % 10 + ":" + value7 / 10 + value7 % 10 + " GMT";
    }
}
