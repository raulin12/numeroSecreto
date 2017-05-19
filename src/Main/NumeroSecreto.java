/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;

/**
 *
 * @author raul
 * 
 */
public class NumeroSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        double num = Math.random() * 10;
        int numero = (int) num;
        int n =0;
        int valor = 0;
        do {
           System.out.print("Introduce un valor:  ");
           valor = teclado.nextInt();
           if (valor > numero) {
               System.out.println("¡Te has pasado!");
           }
           if (valor < numero) {
               System.out.println("¡Te quedas corto!");
           }
           n++;
        }while (valor != numero);
 
        System.out.println("¡Correcto! El número es: " + numero);
        System.out.println("Has necesitado " + n + " intentos");
    }

    
}
