/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KKT;

import java.util.Scanner;

/**
 *
 * @author BUI PHAT
 */
public class Dog {

    private String id;
    private String name;
    private int age;
    private double price;
    private String type;
    private String breed;
    private boolean isTrained;

    public Dog() {
    }

    public Dog(String id, String name, int age, double price, String type, String breed, boolean isTrained) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
        this.type = type;
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dog id :");
        this.id = sc.nextLine();
        System.out.println("Enter dog name: ");
        this.name = sc.nextLine();
        System.out.println("Enter dog age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter dog price: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter dog type: ");
        this.type = sc.nextLine();
        System.out.println("Enter dog breed: ");
        this.breed = sc.nextLine();
        System.out.println("Is Trained ?(True/False): ");
        this.isTrained = Boolean.parseBoolean(sc.nextLine());
    }

    public void display() {
        System.out.println("Dog Id: " + this.id);
        System.out.println("Dog name: " + this.name);
        System.out.println("Dog age: " + this.age);
        System.out.println("Dog price: " + this.price);
        System.out.println("Dog type: " + this.type);
        System.out.println("Dog breed: " + this.breed);
        System.out.println("Istrained?: " + this.isTrained);
    }

    public double getPrice() {
        return this.price;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

