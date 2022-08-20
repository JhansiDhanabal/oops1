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
public class problem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the integer:");
        int n=obj.nextInt();
        int p,i,j;
        for(i=2;i<=n;i++)
        {
            p=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    p=1;
                }
            }
            if(p==0)
                System.out.println(i);
        }
    }
    
}
