
package petmn;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void saveToFile(ArrayList<Pet> pets) {
        try (PrintWriter pw = new PrintWriter("pets.txt")) {
            for (Pet p : pets) {
                pw.println(p.toString());
            }
        } catch (Exception e) {
            System.out.println("Error saving file!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter = 0;
        int enter1 = 0;
        ArrayList<Pet> pets = new ArrayList<>();


        try {
            File file = new File("pets.txt");
            if (file.exists()) {
                Scanner fSc = new Scanner(file);

                while (fSc.hasNextLine()) {
                    String line = fSc.nextLine();
                    if (line.trim().isEmpty()) {
                        continue;
                    }
                    String[] d = line.split(",");
                    if (d.length < 7) continue;

                    String id = d[0].trim();
                    String name = d[1].trim();
                    int age = Integer.parseInt(d[2].trim());
                    double price = Double.parseDouble(d[3].trim());
                    String type = d[4].trim();
                    boolean flag = Boolean.parseBoolean(d[5].trim());
                    String extra = d[6].trim();
                    
                    

                    if (type.equalsIgnoreCase("Dog")) {
                       pets.add(new Dog(id,name,age,price,flag,extra));
                        
                    } else if (type.equalsIgnoreCase("Cat")) {
                         pets.add(new Cat(id, name, age, price, flag, extra));
                        
                    }
                }
                fSc.close();
                System.out.println("Loaded " + pets.size() + " pets from file.");
            } else {
                System.out.println("Data file not found. Starting with empty list.");
            }

        } catch (Exception e) {
            System.out.println("Error reading pets.txt: " + e.getMessage());
        }

        do {
            System.out.println("=== Pet Store ===");
            System.out.println("1. Add Pets");
            System.out.println("2. Show All Pets");
            System.out.println("3. Search Pets");
            System.out.println("4. Close");
            if (sc.hasNextInt()) {
                enter = Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("Invalid selection, please enter again!");
                sc.next();
                continue;
            }
            switch (enter) {
                case 1:
                    System.out.println("Which species you want to add?");
                    System.out.println("1. Dog");
                    System.out.println("2. Cat");
                    System.out.println("3. Close");
                    if (sc.hasNextInt()) {
                        enter1 = Integer.parseInt(sc.nextLine());
                    } else {
                        System.out.println("Invalid selection, please enter again!");
                        sc.next();
                        continue;
                    }
                    if (enter1 == 1) {
                        Pet newDog = new Dog();
                        newDog.input(sc);
                        pets.add(newDog);
                        System.out.println(newDog);
                    } else if (enter1 == 2) {
                        Pet newCat = new Cat();
                        newCat.input(sc);
                        pets.add(newCat);
                        System.out.println(newCat); 
                       
                    } else if (enter1 == 3) {
                        break;
                    } else {
                        System.out.println("Invalid selection, please enter again!");
                    }
                    break;
                case 2:
                    System.out.println("=== List of Pets ===");
                    for (Pet pet : pets) {

                        System.out.println(pet);
                        
                        pet.makeSound();
                        
                        System.out.println("Discount price: "+pet.getDiscountPrice());
                    }
                   
                    break;
                case 3:
                    System.out.println("Enter ID to search: ");
                    String searchId= sc.nextLine();
                    boolean found = false;
                    for (Pet p : pets) {
                        if (p.getId().equalsIgnoreCase(searchId.trim())) {
                            System.out.println(p);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Pet not found!");
                    }
                    break;
                case 4:
                    saveToFile(pets);
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection, please enter again!");
            }
        } while (enter != 4);
    }

}
