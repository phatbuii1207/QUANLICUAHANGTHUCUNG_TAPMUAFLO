package petmn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cat extends Pet {

    private String furColor;
    private boolean isIndoor;

    public Cat() {
        super();
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("FurColor: ");
        this.furColor = sc.nextLine();
        System.out.println("Is Indoor? (true/false): ");
        this.isIndoor = sc.nextBoolean();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("FurColor: " + this.furColor + "   Is Indoor: " + this.isIndoor);
    }
}
