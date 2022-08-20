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
public class problem26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lightyear;
        Scanner obj=new Scanner(System.in);
        int days;
        System.out.println("enter number of days:");
        days=obj.nextInt();
        lightyear=3.8*Math.pow(10,8)*24*60*60*days;
        System.out.println("distance travelled by light in "+days+" is "+lightyear);
    }
    
}
