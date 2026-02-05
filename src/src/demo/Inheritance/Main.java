package petmn;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tạo đối tượng 
        Cat myCat = new Cat();
        myCat.input();
        myCat.display();
        
        Dog myDog = new Dog();
        myDog.input();
        myDog.display();
    }
    
}
