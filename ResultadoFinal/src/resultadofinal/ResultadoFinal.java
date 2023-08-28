/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resultadofinal;


import javax.swing.JOptionPane;

/**
 *
 * @author Guima
 */
public class ResultadoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n, s = 0 ;
        double totaln = 0;
        double par = 0;
        double impar = 0;
        double maiscem = 0;
        double media;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
        if ((n%2 == 0)&&(n!=0)){
            par++;
        }
        if ((n%2 == 1)&&(n!=0)){
            impar++;
        }
        if (n>=100){
            maiscem++;
        }
        if(n!=0){
            totaln++;
        }
        s+=n;
        } while (n!=0);
        media = s/totaln;
        JOptionPane.showMessageDialog(null, "<html>Resultado final: <hr>" + 
                "<br>Somatório vale: " + s + 
                "<br>Números Pares: " + par +
                "<br>Números Ímpares: " + impar +
                "<br>Maiores que cem: " + maiscem +
                "<br>Média dos Números: " + media + "</html>");
    }
    
}
