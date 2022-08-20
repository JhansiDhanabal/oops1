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
public class program8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of days:");
        day=obj.nextInt();
        int month=day/30;
        int rem=day%30;
        System.out.println(month+" Month and "+rem+" days");              
    }
    
}
