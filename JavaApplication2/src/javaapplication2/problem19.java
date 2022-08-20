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
public class problem19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quantity;
        double unit;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter unit prize:");
        unit=obj.nextDouble();
        System.out.println("enter quantity:");
        quantity=obj.nextInt();
        double sales=unit*quantity;
        double dis;
        int per=0;
        if(quantity<100)
        {
            sales=unit*quantity;
            dis=0.0;
            per=0;
        }
        
        else if(quantity<=120)
        {
            dis=(double)sales/10;
            sales=sales-dis;
            per=10;
        }
        else
        {
            dis=(double)sales/15;
            sales=sales-dis;
            per=15;
        }
        System.out.println("the revenue from sale:"+sales);
        System.out.println("discount:"+dis+"("+per+".0%)");
        
    }
    
}
