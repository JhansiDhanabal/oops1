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
public class program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int a[]= new int [5];
        int sum=0;
        System.out.println("enter five subjects mark:");
        for(int i=0;i<5;i++)
        {
            a[i]=obj.nextInt();
            sum=a[i]+sum;
        }
        double avg= sum/5;
        if(avg>=90)
            System.out.println("EXCELLENT");
        else if(avg>=80)
            System.out.println("VERY GOOD");
        else if(avg>=70)
            System.out.println("GOOD");
        else 
            System.out.println("POOR");
        
        
    }
    
}
