import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String num = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"; // 200-digit number
        int m = 17;
        System.out.println(MammothMath.moduloLargeNumber(num, m)); // prints the modulo of the large number

    }

    public int calculateDaysBetweenDates(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        return (int) ((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
    }

    public long calculateSecondsSince(Date givenDate) {
        if (givenDate == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        Date currentDate = new Date();
        return (currentDate.getTime() - givenDate.getTime()) / 1000;
    }

    public String reverse(String input) {
        if (input == null)
            return null;
        if (input.length() > 1)
            return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
        return input;
    }

}