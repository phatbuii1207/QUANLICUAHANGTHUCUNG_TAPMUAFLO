
package petmn;
import java.util.Scanner;

public class Cat extends Pet{
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

    @Override
    public void display() {
        super.display();
        System.out.println("FurColor: " + this.furColor + " Is Indoor: " + this.isIndoor);
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean isIsIndoor() {
        return isIndoor;
    }
    
}
