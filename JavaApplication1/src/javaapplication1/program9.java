/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class program9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cgpa;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter marks in cgpa:");
        cgpa=obj.nextInt();
        
        switch(cgpa)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("Very Poor");
                break;
                
            case 3:
            case 4:
            case 5:
                System.out.println("Poor");
                break;
            case 6:
            case 7:
                System.out.println("Good");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Very Good");
                break;
                
        }
    }
    
}
