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
public class problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("enter last value:");
        int n=obj.nextInt();
        double sum=0.0;
        int i;
        for(i=1;i<=n;i++)
        {
            sum=sum+(double)1/i;
        }
        System.out.println("sum of harmonic series upto "+n+" is "+sum);
    }
    
}
