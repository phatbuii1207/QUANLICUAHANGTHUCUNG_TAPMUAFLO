/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Pet> petList;
    private double totalAmount;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.petList = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addPet(Pet p) {
        petList.add(p);
    }

    public void calculateTotal() {
        totalAmount = 0;
        for (Pet p : petList) {
            totalAmount += p.getPrice();
        }
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.print("Customer: ");
        customer.display();
        System.out.println("Pets in order:");
        for (Pet p : petList) {
            p.display();
        }
        System.out.println("Total amount: " + totalAmount);
    }
}

