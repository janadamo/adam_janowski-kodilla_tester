public class GradesApplication {
    public static void main(String[] args) {
        Grades g = new Grades();
        g.add(4);
        g.add(5);
        g.add(2);
        g.add(5);
        g.add(4);
        g.add(6);
        g.add(3);
        g.add(4);
        g.add(5);
        g.add(4);
        g.printGrades();
        double sum = g.sumGrades();
        System.out.println(sum);
        double average = g.sumAverage();
        System.out.println(average);

    }
}
