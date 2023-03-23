import java.util.Random;

public class RandomNumbers {
    private int max;
    private int min;
    public int getMax() {
        return this.max;
    }
    public int getMin() {
        return this.min;
    }

    public static void main(String[] args) {

        int maximum = 5000;

        Random random = new Random();
        int result = 0;
        int sum = 0;
        for (int i = 0; i <= maximum; i++ ) {
            if (sum < maximum) {
                int temp = random.nextInt(31);
                sum = sum + temp;
                System.out.println(sum);
            }
        }
    }
}


