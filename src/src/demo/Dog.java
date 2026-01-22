/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public Dog() {
        super();
        this.type = "Dog";
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breed: ");
        breed = sc.nextLine();
        System.out.print("Is trained? (true/false): ");
        isTrained = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" %-15s %-10s\n", breed, isTrained);
    }
}
