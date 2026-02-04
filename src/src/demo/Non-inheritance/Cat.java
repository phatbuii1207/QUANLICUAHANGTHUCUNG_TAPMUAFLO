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
public class Cat {
    private String id;
    private String name;
    private int age;
    private double price;
    private String type;
    private String furColor;
    private boolean isIndoor;

    public Cat() {
    }

    public Cat(String id, String name, int age, double price, String type, String furColor, boolean isIndoor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
        this.type = type;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cat id: ");
        this.id=sc.nextLine();
        System.out.println("Enter cat name: ");
        this.name=sc.nextLine();
        System.out.println("Enter cat age: ");
        this.age=Integer.parseInt(sc.nextLine());
        System.out.println("Enter cat price: ");
        this.price=Double.parseDouble(sc.nextLine());
        System.out.println("Enter cat type: ");
        this.type=sc.nextLine();
        System.out.println("Enter cat furColor: ");
        this.furColor=sc.nextLine();
        System.out.println("Is Indoor? (True/False): ");
        this.isIndoor=Boolean.parseBoolean(sc.nextLine());
        
    }
    public void display(){
        System.out.println("Cat id: "+this.id);
        System.out.println("Cat name: "+this.name);
        System.out.println("Cat age: "+this.age);
        System.out.println("Cat price: "+this.price);
        System.out.println("Cat type: "+this.type);
        System.out.println("Cat furColor: "+this.furColor);
        System.out.println("Is Indoor?: "+this.isIndoor);
           
    }
    public double getPrice(){
        return this.price;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
        
  
            
          
}

