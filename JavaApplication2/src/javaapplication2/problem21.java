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
public class problem21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of rows:");
        n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    
}
