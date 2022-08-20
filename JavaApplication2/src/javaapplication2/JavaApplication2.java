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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number:");
        a=obj.nextInt();
        System.out.println("enter second number:");
        b=obj.nextInt();
        int min=(a<b)?a:b;
        System.out.println("minimum of "+a+" and "+b+" is "+min);
        
    }
    
}
