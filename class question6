public class question6 {
    public static int countDigits(long n) {
        if (n == 0)
            return 1;

        int count = 0;

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
