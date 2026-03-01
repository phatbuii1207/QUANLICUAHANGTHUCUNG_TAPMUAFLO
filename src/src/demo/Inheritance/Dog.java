
package petmn;


public class Dog extends Pet{
    private String breed;
    private boolean isTrained;

    public Dog(String id, String name, int age, double price, boolean isTrained, String breed) {
        super(id, name, age, "Dog", price);
        this.isTrained = isTrained;
        this.breed = breed;
    }

    @Override
    public void display() {
        System.out.println("Dog | Id: " + getId() +", Name: " + getName() +", Age: " + getAge() +", Price: " + getPrice() +", IsTrained: " + isTrained +", Breed: " + breed);
    }
}
