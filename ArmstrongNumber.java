public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
}
