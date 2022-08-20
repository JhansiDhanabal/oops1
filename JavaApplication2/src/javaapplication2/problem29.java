/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author USER
 */
public class problem29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        for(int k=1;k<=10;k++)
        {
            int j=1;
            while(j<=11)
            {
                if(i%15==0)
                    System.out.print("CozaLoza ");
                else if(i%21==0)
                    System.out.print("CozaWoza ");
                else if(i%35 == 0)
                    System.out.print("LozaWoza ");
                else if(i%3==0)
                    System.out.print("Coza ");
                else if(i%5==0)
                    System.out.print("Loza ");
                else if(i%7==0)
                    System.out.print("Woza ");
                else
                    System.out.print(i+" ");
                
                j++;
                i++;
                
            }
            System.out.println();
        }
    }
    
}
