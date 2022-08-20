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
public class program4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[10];
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("enter size of array:");
        n=obj.nextInt();
        int i;
        System.out.println("enter array elements:");
        for(i=0;i<n;i++)
            a[i]=obj.nextInt();
        
        int small=a[0];
        int big=a[0];
        for(i=0;i<n;i++)
        {
            if(small>a[i])
                small=a[i];
            if(big<a[i])
                big=a[i];
        }
        System.out.println("Largest element in the array:"+big);
        System.out.println("Smallest element in the array:"+small);
    }
    
}
