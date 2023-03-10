public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <= 1600) {
            System.out.println("This notebook is medium heavy.");
        } if (this.weight > 1600) {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2019 && this.price > 1000) {
            System.out.println("This notebook in not a good value for money.");
        } else if (this.year >= 2019 && this.year <= 2022 && this.price <= 1000) {
            System.out.println("This notebook is a good value for money.");
        } else if (this.year > 2022 && this.price < 1000)
            System.out.println("This is a bargain.");
    }
}
