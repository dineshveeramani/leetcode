public class WaterBottles {

    public static int maxBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = newBottles + (empty % numExchange);
        }

        return total;
    }

    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(maxBottles(numBottles, numExchange));
    }
}
