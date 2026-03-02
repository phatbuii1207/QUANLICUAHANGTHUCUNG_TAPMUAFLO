package petmn;

import java.util.Scanner;

public class Pet {

    private String id;
    private String name;
    private int age;
    private double price;
    private String type;

    public Pet() {
    }

    public Pet(String id, String name, int age, double price, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
        this.type = type;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id = sc.nextLine();
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        System.out.print("Price: ");
        this.price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Type: ");
        this.type = sc.nextLine();
    }

    public void display() {
        System.out.println("ID: " + this.id + " Name: " + this.name + " Age: " + this.age + " Price: " + this.price + " Type: " + this.type);
    }

    public double getPrice() {
        return this.price;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
