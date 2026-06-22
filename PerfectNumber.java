public class PerfectNumber {

    public static boolean isPerfect(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(isPerfect(num));
    }
}
