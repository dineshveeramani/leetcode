public class CountDigits {

    public static long countDigits(long n) {
        if (n == 0) return 1;

        long count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(countDigits(n));
    }
}
