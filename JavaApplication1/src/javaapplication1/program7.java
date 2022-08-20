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
public class program7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        n=obj.nextInt();
        int sum=0,product=1;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            product*=rem;
            n=n/10;
        }
        System.out.println("sum of digits is "+sum);
        System.out.println("product of digits is "+product);
        
    }
    
}
