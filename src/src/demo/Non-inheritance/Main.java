package KKT;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.input();
        System.out.println("\n--Dog Infor--");
        dog.display();
        
        
        System.out.println("\n=================\n");
        
        Cat cat=new Cat();
        cat.input();
        System.out.println("\n--Cat Infor--");
        cat.display();
        
    }
}
