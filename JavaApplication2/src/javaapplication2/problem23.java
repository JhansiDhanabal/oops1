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
public class problem23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of array:");
        n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++)
            a[i]=obj.nextInt();
        System.out.println("enter number to be searched:");
        int num=obj.nextInt();
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(num==a[i])
                pos=i+1;
        }
        if(pos==0)
            System.out.println("the given number "+num+" is nor found");
        else
            System.out.println(num+" is found in "+pos+" position");
    }
    
}
