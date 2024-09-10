package clasesymetodos;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Se encarga de gestionar la logica de ingreso de numeros y 
calcuulo de estadisticas (minimo, maximo y promedio).
 */
public class ControladorNumeros {

    // Atributos
    private int minValor;
    private int maxValor;
    private int suma;
    private int cantidadNumeros;
    private Validadora validadora; //Instacia de la clase validadora.

    // Metodos
    // Constructor
    public ControladorNumeros(int cantidadNumeros) {
        this.minValor = 101;
        this.maxValor = -101;
        this.suma = 0;
        this.cantidadNumeros = cantidadNumeros;
        this.validadora = new Validadora();
    }

    // METODO para ingresar los numeros del usuario
    public void ingresarNumero() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese " + cantidadNumeros + "numeros enteros entre -100 y 100: ");

        // bucle
        while (contador < cantidadNumeros) {
            System.out.println("Numero " + (contador + 1) + ": ");

            try {
                int numero = scanner.nextInt();

                // verificar
                if (validadora.validar(numero, -100, 100)) {
                    // metodo que actualice las estadisticas(min, max y promedio)
                    actualizarEstadisticas(numero);
                    contador++;
                } else {
                    System.out.println("El numero esta fuera del rango -100 a 100");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero dentro del rango");
                scanner.next();
            }
        }

        scanner.close();
    }

    // METODO para actualizar el min, max y la suma
    private void actualizarEstadisticas(int numero) {
        if (numero < minValor) {
            minValor = numero;
        }
        if (numero > maxValor) {
            maxValor = numero;
        }

        suma += numero;
    }

    // METODO para calcular promedio
    public double calcularPromedio() {
        return suma / (double) cantidadNumeros;
    }

    // METODOS Getters para obtener el valor minimo y maximo en el main.
    public int getMinValor() {
        return minValor;
    }

    public int getMaxValor() {
        return maxValor;
    }
}
