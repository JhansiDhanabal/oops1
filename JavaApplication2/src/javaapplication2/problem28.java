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
public class problem28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        n=obj.nextInt();
        int j;
        j=n;
        int sum=0;
        int rem;
        int pro=1;
        while(j>0)
        {
            rem=j%10;
            sum+=rem;
            pro*=rem;
            j=j/10;
        }
        int k=0;
        k=sum+pro;
        if(k==n)
            System.out.println("its a special type problem");
        else
            System.out.println("its not a special type problem");
    }
    
}
