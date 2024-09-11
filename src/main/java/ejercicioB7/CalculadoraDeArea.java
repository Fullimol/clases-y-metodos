package ejercicioB7;

public class CalculadoraDeArea {

    public static double calcularAreaCuadrado(double longitudLado) {
        return longitudLado * longitudLado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double radio) {
        double pi = 3.14159;
        return pi * (radio * radio);
    }
}
