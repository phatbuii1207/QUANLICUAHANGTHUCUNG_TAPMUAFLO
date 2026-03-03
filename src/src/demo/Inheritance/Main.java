
package petmn;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
      public static void saveToFile(ArrayList<Pet> pets) {
        try (PrintWriter pw = new PrintWriter("pets.txt")) {
            for (Pet p : pets) {
                if (p instanceof Dog ) {
                    Dog d = (Dog) p;
                    pw.println("Dog," + d.getId() + "," + d.getName() + "," +d.getAge() + "," + d.getPrice() + "," + d.isIsTrained() + "," + d.getBreed());
                } else if (p instanceof Cat ) {
                    Cat c = (Cat) p;
                    pw.println("Cat," + c.getId() + "," + c.getName() + "," +c.getAge() + "," + c.getPrice() + "," +c.isIsIndoor() + "," + c.getFurColor());
                }
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
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();

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
                    String type = d[0].trim();
                    String id = d[1].trim();
                    String name = d[2].trim();
                    int age = Integer.parseInt(d[3].trim());
                    double price = Double.parseDouble(d[4].trim());
                    boolean flag = Boolean.parseBoolean(d[5].trim());
                    String extra = d[6].trim();

                    if (type.equalsIgnoreCase("Dog")) {
                        Dog dog = new Dog(id, name, age, price, flag, extra);
                        pets.add(dog);
                        dogs.add(dog);
                    } else if (type.equalsIgnoreCase("Cat")) {
                        Cat cat = new Cat(id, name, age, price, flag, extra);
                        pets.add(cat);
                        cats.add(cat); 
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
                        Dog newDog = new Dog();
                        newDog.input(sc);
                        dogs.add(newDog);
                        pets.add(newDog);
                        newDog.display();
                    } else if (enter1 == 2) {
                        Cat newCat = new Cat();
                        newCat.input(sc);
                        cats.add(newCat);
                        pets.add(newCat);
                        newCat.display();
                    } else if (enter1 == 3) {
                        break;
                    } else {
                        System.out.println("Invalid selection, please enter again!");
                    }
                    break;
                case 2:
                    System.out.println("=== List of Dogs ===");
                    for (Dog d : dogs) {
                        d.display();
                    }
                    System.out.println("=== List of Cats ===");
                    for (Cat c : cats) {
                        c.display();
                    }
                    break;
                case 3:
                    System.out.println("Enter ID to search: ");
                    String searchId = sc.next();
                    boolean found = false;
                    for (Pet p : pets) {
                        if (p.getId().equalsIgnoreCase(searchId)) {
                            p.display();
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
