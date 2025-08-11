package Ejercicios;

import java.util.Scanner;

public class ContadorVocyCons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra en MINUSCULAS: ");
        String palabra= scanner.nextLine();
        
        int vocales = 0;
        int consonantes = 0;

        for (int i= 0; i< palabra.length(); i++){
            char letra = palabra.charAt(i);

            if(esLetra(letra)){
                if(esVocal(letra)){
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Numero de vocales: " + vocales);
        System.out.println("Numero de consonantes: "+ consonantes);
        scanner.close();
    }

    private static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' ;
    }

    private static boolean esLetra(char c) {
        return c >= 'a' && c <= 'z';
    }
}
