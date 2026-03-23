
package petmn;

import java.util.Scanner;


public class Cat extends Pet implements ISellable{

    private String furColor;
    private boolean isIndoor;

    public Cat() {
        super();
        setType("Cat");
    }

    public Cat(String id, String name, int age, double price, boolean isIndoor, String furColor) {
        super(id, name, age, price, "Cat");
        this.isIndoor = isIndoor;
        this.furColor = furColor;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("FurColor: ");
        this.furColor = sc.nextLine();
        System.out.println("Is Indoor? (true/false): ");
        this.isIndoor = Boolean.parseBoolean(sc.nextLine());
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    @Override
    public String toString() {

        return super.toString() + "," + this.furColor + "," + this.isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * 0.5;
    }
}
