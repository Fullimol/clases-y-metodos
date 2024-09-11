/*
[B.03] - La calculadora
Realizar un programa que permita realizar operaciones matemáticas simples (suma, resta, multiplicación y división).

Crear una clase llamada Calculadora que posea dos métodos estáticos (de clase):
calcular (público): Recibirá tres parámetros, el primer parámetro será el primer operando, el segundo parámetro será el
segundo operando y el tercer y último parámetro será la operación matemática a realizar. El método devolverá el resultado
de dicha operación.
validar (privado): Recibirá como parámetro al segundo operando de la función calcular. Este método se debe utilizar sólo
cuando la operación elegida sea la DIVISIÓN. Este método devolverá true si el operando es distinto de cero, false caso
contrario.

Se le debe pedir al usuario que ingrese dos números y la operación que desea realizar (ingresando el caracter +, -, *, o /).
El usuario decidirá cuándo finalizar el programa
 */
package ejercicioB3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese primer valor: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese segundo valor: ");
            int num2 = scanner.nextInt();
            System.out.print("Ingrese operacion (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            double respuesta = Calculadora.calcular(num1, num2, operacion);

            System.out.println(respuesta);

            
            System.out.println("Desea continuar? (s / n)");
            String consulta = scanner.next();


            do {
                if (consulta.equals("s")) {
                continuar = true;
                }
                if (consulta.equals("n")) {
                    continuar = false;
                } 
            } while (!consulta.equals("s") && !consulta.equals("n"));

        }

    }
}
