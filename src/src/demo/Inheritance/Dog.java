
package petmn;
import java.util.Scanner;

public class Dog extends Pet{
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
        System.out.println("Breed ");
        this.breed = sc.nextLine();
        System.out.println("Is Trained? (true/false): ");
        this.isTrained = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + this.breed + " Is Trained? " + this.isTrained);
    }

    public String getBreed() {
        return breed;
    }

    public boolean isIsTrained() {
        return isTrained;
    }
    
}
