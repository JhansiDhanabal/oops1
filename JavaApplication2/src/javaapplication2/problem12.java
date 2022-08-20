/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author USER
 */
public class problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        for(int i=101;i<200;i++)
        {
            if(i%7==0)
               sum+=i;
        }
        System.out.println("sum of all integers greater than 100 and less than 200 that are divisible by 7 is "+sum);
    }
    
}
