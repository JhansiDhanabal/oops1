/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class problem22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("enter first number:");
        a=obj.nextInt();
        System.out.println("enter second number:");
        b=obj.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
    }
    
}
