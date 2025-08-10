package Ejercicios;

import java.util.*;

public class Calculadora{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese un numero: ");
        double numero1= scanner.nextDouble();

        System.out.println("Ingrese segundo numero: ");
        double numero2= scanner.nextDouble();

        System.out.println("Seleccione la operacion que lo requiera:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        System.out.println("Elige del 1-4 la operacion a realizar");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado= numero1 + numero2;
                break;
            case 2:
                resultado= numero1-numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 !=0){
                    resultado= numero1 / numero2;
                } else {
                    System.out.println("ERROR: no se puede dividir por cero");
                    operacionValida = false;
                }
                break;        
            default:
            System.out.println("Opcion invalida");
            operacionValida = false;
        }
        if (operacionValida){
            System.out.println("El resultado es: "+ resultado);
        }
        scanner.close();
     }
}