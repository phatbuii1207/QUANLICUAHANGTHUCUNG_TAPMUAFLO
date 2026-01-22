/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

public class Pet {
    protected String id;
    protected String name;
    protected int age;
    protected double price;
    protected String type;

    public Pet() {
    }

    public Pet(String id, String name, int age, double price, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
        this.type = type;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pet id: ");
        id = sc.nextLine();
        System.out.print("Enter pet name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter type: ");
        type = sc.nextLine();
    }

    public void display() {
        System.out.printf("%-10s %-15s %-5d %-10.2f %-10s", id, name, age, price, type);
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
