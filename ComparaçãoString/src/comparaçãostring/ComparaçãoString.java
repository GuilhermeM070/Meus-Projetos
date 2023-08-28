/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaçãostring;

/**
 *
 * @author Guima
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1 = "Guilherme";
        String n2 = "Guilherme";
        String n3 = new String ("Guilherme");
        String res;
        String oxo;
        res = (n1.equals(n3))?"igual":"diferente";
        oxo = (n1==n3)?"igual":"diferente";
        System.out.println(res);
        System.out.println(oxo);
    }
    
}
