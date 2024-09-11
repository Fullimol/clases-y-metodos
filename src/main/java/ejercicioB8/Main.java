/*
[B.08] - Pitágoras estaría orgulloso
Crear una aplicación de consola que pida al usuario ingresar la base y la altura de un triángulo en centímetros.
El programa deberá calcular la longitud de la hipotenusa aplicando el teorema de pitágoras y usar los métodos pow y sqrt
de la clase Math para realizar los cálculos.
Mostrar el resultado en la consola

sqrt() devuelve la raíz cuadrada de un número
pow()  devuelve un número especificado elevado a la potencia especificada.
 */
package ejercicioB8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar la base (cm): ");
        double baseTriangulo = scanner.nextDouble();

        System.out.print("Ingresar la altura (Cm): ");
        double alturaTriangulo = scanner.nextDouble();
        
        double hipotenusa = calcularPitagoras(baseTriangulo, alturaTriangulo);
        System.out.println("LA HIPOTENUSA ES: " + hipotenusa + "Cm");
          

    }
    
    private static double calcularPitagoras(double base, double altura){
        double catetoA = base * base;
        double catetoB = altura * altura;

        double hipotenusa = Math.sqrt(catetoA + catetoB);
                
        return hipotenusa;
    }
}
