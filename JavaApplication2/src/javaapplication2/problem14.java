/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author USER
 */
public class problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the digit:");
        n=obj.nextInt();
        int j=n;
        int c=0;
        while(j>0)
        {
            c++;
            j=j/10;
        }
        c=c-1;
        int rem;
        while(c>-1)
        {
            j=(int)(Math.pow(10,c));
            rem=n/j;
            n=n-rem*j;
            switch(rem)
            {
                case 0 -> System.out.print("zero ");
                case 1 -> System.out.print("one ");
                case 2 -> System.out.print("two ");
                case 3 -> System.out.print("three ");
                case 4 -> System.out.print("four ");
                case 5 -> System.out.print("five ");
                case 6 -> System.out.print("six ");
                case 7 -> System.out.print("seven ");
                case 8 -> System.out.print("eight ");
                case 9 -> System.out.print("nine ");
            }     
            c--;
        }
        
    }
    
}
