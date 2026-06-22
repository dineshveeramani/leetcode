public class HappyNumber {

    public static boolean isHappy(int n) {
        while (n != 1) {
            if (n == 4) {
                return false;
            }
            n = getSum(n);
        }
        return true;
    }

    public static int getSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
