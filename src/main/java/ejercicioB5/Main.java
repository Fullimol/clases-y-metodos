/*
[B.05] - Aprendete las tablas
Crear una aplicación de consola que permita al usuario ingresar un número entero.
Desarrollar un método estático que reciba un número y devuelva la tabla de multiplicación de ese número en formato
String.
Mostrar en la consola el resultado.
Por ejemplo, si se ingresa el número 2 la salida deberá ser:
Tabla de multiplicar del número 2:
2x1=2
2x2=4 2x3=6
2x4=8
2x5=10
2x6=12 2x7=14
2x8=16
2x9=18
Bonus:Utilizar la clase StringBuilder combinada con Strings interpolados para armar el resultado.
 */
package ejercicioB5;

public class Main {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("TABLA DE MULTIPLICAR");
        String resultado = tabla(numero);
        System.out.println(resultado);
    }

    private static String tabla(int numero) {
        StringBuilder respuesta = new StringBuilder(); //Es una clase en Java que permite construir y manipular cadenas de caracteres de manera eficiente

        for (int i = 1; i <= 10; i++) {
            respuesta.append(String.format("%dx%d = %d\n", numero, i, numero * i));
        }
        return respuesta.toString();

    }
}