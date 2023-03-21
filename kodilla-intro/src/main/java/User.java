public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        int sum = 0;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
        User phil = new User("Phil", 20);
        User mike = new User("Mike", 16);
        User dan = new  User("Dan", 18);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {phil, mike, dan, david, eva, frankie};

        double sumAge = 0;
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
            System.out.println(sum);
        }
        int average;
        average = sum/users.length;
        System.out.println(average);

        int belowAverage = average;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < belowAverage) {
            System.out.println(users[i].name);
            }
    }
}
}




