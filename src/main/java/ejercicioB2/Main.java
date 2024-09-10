/*
[B.02] - Validadora
Realizar un programa que sume números enteros hasta que el usuario lo determine, por medio de un mensaje
“¿Continua?(S/N)”.
En el método estático validarS_N() de la clase ValidarRespuesta, se validará el ingreso de opciones.
El método NO recibe parámetros y devuelve un valor de tipo booleano, truesi se ingresó una “S” y falsesi se ingresó una
“N”.
El método deberá validar si otro caracter fue ingresado mostrando un mensaje de error y pidiendo el reingreso del mismo.
*/

package ejercicioB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        boolean continuar = true;
        
        while(continuar){
            System.out.print("Ingrese un numero: ");
            int numero = scanner.nextInt();
            suma += numero;
            
            continuar = ValidarRespuesta.validarS_N(); // utilizo el metodo de la otra clase.
        }
       
        scanner.close();
        System.out.println("La suma total es: " + suma);
        
    }
}
