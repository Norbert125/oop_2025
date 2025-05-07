package oop.labor11.lab11_1;

public class Product implements Comparable<Product> {
    private int id, amount, price;
    private String name;

    public Product(int id, int amount, int price, String name) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void increaseAmount(int newAmount) {
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", amount=" + amount +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.id - o.id;
    }
}