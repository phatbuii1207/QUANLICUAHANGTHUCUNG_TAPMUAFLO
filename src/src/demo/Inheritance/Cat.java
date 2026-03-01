
package petmn;


public class Cat extends Pet {
    private String furColor;
    private boolean isIndoor;

    public Cat(String id, String name, int age, double price, boolean isIndoor, String furColor) {
        super(id, name, age, "Cat", price);
        this.isIndoor = isIndoor;
        this.furColor = furColor;
    }

    @Override
    public void display() {
        System.out.println("Cat | Id: " + getId() +", Name: " + getName() +", Age: " + getAge() +", Price: " + getPrice() +", IsIndoor: " + isIndoor +", FurColor: " + furColor);
    }
}
