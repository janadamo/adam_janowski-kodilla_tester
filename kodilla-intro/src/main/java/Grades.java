import java.util.Arrays;

public class Grades {
    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public void printGrades() {
        System.out.println(Arrays.toString(grades));
    }
    public double sumGrades() {
        double result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[(int) i];
        }
        return result;
    }
    public double sumAverage() {
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        return sumGrades() / grades.length;
    }

}
