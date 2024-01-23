public class MammothMath {
    public static int moduloLargeNumber(String num, int m) {
        if (num == null) {
            throw new IllegalArgumentException("Number cannot be null");
        }
        return num.chars().reduce(0, (acc, c) -> (acc * 10 + (c - '0')) % m);
    }
}
