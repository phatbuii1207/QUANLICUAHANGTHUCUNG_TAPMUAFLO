/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetStoreManagement store = new PetStoreManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== PET STORE MANAGEMENT =====");
            System.out.println("1. Add pet");
            System.out.println("2. Remove pet");
            System.out.println("3. Search pet by name");
            System.out.println("4. Display all pets");
            System.out.println("5. Create order");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    store.addPet();
                    break;
                case 2:
                    store.removePet();
                    break;
                case 3:
                    store.searchPetByName();
                    break;
                case 4:
                    store.displayAllPets();
                    break;
                case 5:
                    store.createOrder();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

