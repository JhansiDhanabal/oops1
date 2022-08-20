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
public class problem27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number:");
        num=obj.nextInt();
        int j;
        j=num;
        int n=0;       
        int rem;
        int k=0;
        while(j>0)
        {
            rem=j%10;
            n=rem+n*10;
            j=j/10;
            k++;
        }
        if(n==num)
            System.out.println("the given number is palindrome");
        else
            System.out.println("the given number is not palindrome");
    }
    
}
