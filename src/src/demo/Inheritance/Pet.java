
package petmn;

import java.util.Scanner;


public abstract class Pet implements ISellable{

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

    public void input(Scanner sc) {

        System.out.print("ID: ");
        this.id = sc.nextLine();
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("Price: ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.age + "," + this.price + "," + this.type;
    }

    public abstract void makeSound();

    
}
