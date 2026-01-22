/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

public class Cat extends Pet {
    private String furColor;
    private boolean isIndoor;

    public Cat() {
        super();
        this.type = "Cat";
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fur color: ");
        furColor = sc.nextLine();
        System.out.print("Is indoor? (true/false): ");
        isIndoor = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" %-15s %-10s\n", furColor, isIndoor);
    }
}

