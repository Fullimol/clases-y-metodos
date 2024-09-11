/*
[B.07] - Calculadora de áreas
Realizar una clase llamada CalculadoraDeArea que posea tres métodos de clase (estáticos) que realicen el cálculo del área
que corresponda:
● public static double calcularAreaCuadrado(double longitudLado)
● public static double calcularAreaTriangulo(double base, double altura)
● public static double calcularAreaCirculo(double radio)
El ingreso de los datos como la visualización se deberán realizar desde el método main().
 */
package ejercicioB7;


public class Main {
    public static void main(String[] args) {
        //cuadrado
        double longitudCuadrado = 10;
        //triangulo
        double baseTriangulo = 10;
        double alturaTriangulo = 15;
        //circulo
        double radioCirculo = 8;
        
        
        double areaCuadrado = CalculadoraDeArea.calcularAreaCuadrado(longitudCuadrado);
        double areaTriangulo = CalculadoraDeArea.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        double areaCirculo = CalculadoraDeArea.calcularAreaCirculo(radioCirculo);
        System.out.println("Area del CUADRADO: " + areaCuadrado);
        System.out.println("Area del TRIANGULO: " + areaTriangulo);
        System.out.println("Area del CIRCULO: " + areaCirculo);
        
    }

}
