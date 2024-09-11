/*
[B.06] - Calcular un factorial
El factorial de un número es una operación que consiste en multiplicar un número “n” por todos los números enteros
positivos que estén debajo de él, por ejemplo el factorial de 3 es el resultado de multiplicar 3 por 2 por 1.
En una aplicación de consola, desarrollar un método estático que calcule el factorial de un número dado
 */
package ejercicioB6;

public class Main {

    public static void main(String[] args) {
        int numeroIngresado = 3;
        
        int resultado = factorial(numeroIngresado);
        System.out.println("El factorial de " + numeroIngresado + " es: " + resultado);
    }

    private static int factorial(int numero) {
        //multiplicar todos los números enteros positivos que estén debajo de él.
        int sumaFactorial = 1;
        for (int i = numero; i >= 1 ; i--) {
            sumaFactorial *= i;
        }
        return sumaFactorial;

    }
}
