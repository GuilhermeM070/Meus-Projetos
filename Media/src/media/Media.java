/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;

import java.util.Scanner;

/**
 *
 * @author Guima
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda nota; ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média é " + m);
        if (m >= 9){
            System.out.println("Parabéns mlk, brilhe, Shinning...");
        } else{
            System.out.println("Tropa do mantém...");
        }
    }
    
}

    
        
    
    