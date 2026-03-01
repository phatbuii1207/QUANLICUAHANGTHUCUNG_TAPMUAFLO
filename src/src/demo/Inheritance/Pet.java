package petmn;


public abstract class Pet {
    private  String id;
    private String name;
    private int age;
    private double price;
    private String type;

    public Pet(String id, String name, int age, String type, double price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.price = price;
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
    

    public abstract void display();
}
