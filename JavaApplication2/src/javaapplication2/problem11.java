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
public class problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter size of array:");
        n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
            a[i]=obj.nextInt();
        for(int j=0;j<n;j++)
        {
            if(a[j]%2==0)
                System.out.println(a[j]+" is even");
            else
                System.out.println(a[j]+" is even");
        }
            
    }
    
}
