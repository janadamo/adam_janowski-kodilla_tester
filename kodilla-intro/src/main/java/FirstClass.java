public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600,1000, 2022);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);// [3]
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 500, 2023);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 1500, 2018);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }
}