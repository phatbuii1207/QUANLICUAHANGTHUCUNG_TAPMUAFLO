
package petmn;

import java.util.Scanner;


public class Dog extends Pet implements ISellable{

    private String breed;
    private boolean isTrained;

    public Dog() {
        super();
        setType("Dog");
    }

    public Dog(String id, String name, int age, double price, boolean isTrained, String breed) {
        super(id, name, age, price, "Dog");
        this.isTrained = isTrained;
        this.breed = breed;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Breed: ");
        this.breed = sc.nextLine();
        System.out.println("Is Trained? (true/false): ");
        this.isTrained = Boolean.parseBoolean(sc.nextLine());
    }

    public String getBreed() {
        return breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public String toString() {

        return super.toString() + "," + this.breed + "," + this.isTrained;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof ");
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * 1.1;
    }
}
