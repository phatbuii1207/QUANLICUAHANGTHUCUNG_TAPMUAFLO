/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class PetStoreManagement {
    private ArrayList<Pet> pets;
    private ArrayList<Order> orders;

    public PetStoreManagement() {
        pets = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addPet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Dog");
        System.out.println("2. Add Cat");
        System.out.print("Choose type: ");
        int choice = Integer.parseInt(sc.nextLine());

        Pet p;
        if (choice == 1) {
            p = new Dog();
        } else {
            p = new Cat();
        }
        p.input();
        pets.add(p);
        System.out.println("Pet added successfully!");
    }

    public void removePet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pet id to remove: ");
        String id = sc.nextLine();

        for (Pet p : pets) {
            if (p.getId().equalsIgnoreCase(id)) {
                pets.remove(p);
                System.out.println("Pet removed!");
                return;
            }
        }
        System.out.println("Pet not found!");
    }

    public void searchPetByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pet name to search: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Pet p : pets) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No pet found!");
        }
    }

    public void displayAllPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets available!");
            return;
        }
        System.out.println("Pet List:");
        for (Pet p : pets) {
            p.display();
        }
    }

    public void createOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order id: ");
        String orderId = sc.nextLine();

        Customer customer = new Customer();
        customer.input();

        Order order = new Order(orderId, customer);

        while (true) {
            System.out.print("Enter pet id to add to order (or 'done' to finish): ");
            String petId = sc.nextLine();
            if (petId.equalsIgnoreCase("done")) {
                break;
            }

            Pet foundPet = null;
            for (Pet p : pets) {
                if (p.getId().equalsIgnoreCase(petId)) {
                    foundPet = p;
                    break;
                }
            }

            if (foundPet != null) {
                order.addPet(foundPet);
                System.out.println("Pet added to order!");
            } else {
                System.out.println("Pet not found!");
            }
        }

        order.calculateTotal();
        orders.add(order);
        System.out.println("Order created successfully!");
        order.display();
    }
}

