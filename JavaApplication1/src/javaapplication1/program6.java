/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author USER
 */
public class program6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        if(a<b)
            System.out.println("minimum value is "+a);
        else
            System.out.println("minimum value is "+b);
    }
    
}
