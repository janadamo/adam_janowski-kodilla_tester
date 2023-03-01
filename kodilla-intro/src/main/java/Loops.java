public class Loops {
    public int getCountOfRandomNumber(int max) {
        String random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
