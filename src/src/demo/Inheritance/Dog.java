package petmn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dog extends Pet {

    private String breed;
    private boolean isTrained;

    public Dog() {
        super();
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Breed ");
        this.breed = sc.nextLine();
        System.out.println("Is Trained? (true/false): ");
        this.isTrained = sc.nextBoolean();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + this.breed + "   Is Trained? " + this.isTrained);
    }

}
