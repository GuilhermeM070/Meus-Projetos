/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Guima
 */
public class TesteFuncao01 {
    
     static int soma (int a, int b){
         int s = a + b;
         System.out.println("A soma é " +s);
         return s;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Somaremos");
        int sm = soma (70,5);
    }
    
}