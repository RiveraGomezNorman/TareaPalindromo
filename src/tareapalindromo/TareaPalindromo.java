/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapalindromo;

import java.util.Scanner;

/**
 *
 * @author NORMAN
 */
public class TareaPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inicio = 0;
        String sPalabra;
        boolean espalindromo = false;
        System.out.println("Ingresar palabra: ");
        Scanner entrada = new Scanner(System.in);
        sPalabra = entrada.nextLine();
        int des = sPalabra.length() - 1;
        while ((inicio < des) && (!espalindromo)) {

            if (sPalabra.charAt(inicio) == sPalabra.charAt(des)) {
                inicio++;
                des--;
            } else {
                espalindromo = true;
            }
        }
        if (!espalindromo) {
            System.out.println(sPalabra + " es un Palindromo");
        } else {
            System.out.println(sPalabra + " NO es un Palindromo");
        }
    }
}
