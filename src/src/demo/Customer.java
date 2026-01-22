/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

public class Customer {
    private String id;
    private String name;
    private String phone;

    public Customer() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer id: ");
        id = sc.nextLine();
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter phone: ");
        phone = sc.nextLine();
    }

    public void display() {
        System.out.printf("%-10s %-15s %-15s\n", id, name, phone);
    }

    public String getName() {
        return name;
    }
}

