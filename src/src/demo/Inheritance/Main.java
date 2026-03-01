
package petmn;
import java.util.*;
import java.io.File;

public class Main {
     public static void main(String[] args) {

        ArrayList<Pet> pets = new ArrayList<>();

        try {
            File file = new File("data/pets.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String[] d = sc.nextLine().split(",");

                String type = d[0];
                String id = d[1];
                String name = d[2];
                int age = Integer.parseInt(d[3]);
                double price = Double.parseDouble(d[4]);
                boolean flag = Boolean.parseBoolean(d[5]);
                String extra = d[6];

                Pet p = null;

               
                if (type.equalsIgnoreCase("Dog")) {
                    p = new Dog(id, name, age, price, flag, extra);
                } else if (type.equalsIgnoreCase("Cat")) {
                    p = new Cat(id, name, age, price, flag, extra);
                }

                if (p != null) {
                    pets.add(p);
                }
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Cannot read pets.txt!");
            return ;
        }

        System.out.println("=== PET LIST ===");
        for (Pet pet : pets) {
            pet.display(); 
        }
        Scanner sc = new Scanner (System.in);
        int choice;
        
        
         do {
            System.out.println("\n=== PET STORE MENU ===");
            System.out.println("1. Show all pets");
            System.out.println("2. Search pet by name");
            System.out.println("3. Search pet by id");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            
            choice = Integer.parseInt(sc.nextLine());
             switch (choice) {
                 case 1:
                     System.out.println("=====PET LIST=====");
                     for (Pet pet : pets) {
                         pet.display();
                         
                     }
                     break;
                     
                 case 2:
                     System.out.println("Enter name: ");
                     String name = sc.nextLine();
                     boolean foundName = false;
                     
                     for (Pet pet : pets) {
                         if(pet.getName().equalsIgnoreCase(name)){
                             pet.display();
                             foundName = true;
                         }
                         
                     }
                     if(!foundName){
                         System.out.println("Pet not found!");
                     }
                     break;
                     
                 case 3:
                     System.out.println("Enter id: ");
                     String id =sc.nextLine();
                     boolean foundId =false;
                     
                     for (Pet pet : pets) {
                         if(pet.getId().equalsIgnoreCase(id)){
                             pet.display();
                             foundId =true;
                         }
                         
                     }
                     if(!foundId){
                         System.out.println("Pet not found!");
                     }
                     break;
                     
                 case 4:
                     System.out.println("Goodbye!");
                     break;
        
                 default:
                     System.out.println("Invalid choice!");
             }
             
         } while (choice !=4);
    }
     
     
}
