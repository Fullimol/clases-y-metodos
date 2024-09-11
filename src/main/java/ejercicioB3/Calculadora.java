package ejercicioB3;

public class Calculadora {

    /*
    calcular (público): Recibirá tres parámetros, el primer parámetro será el primer operando, el segundo parámetro será el
    segundo operando y el tercer y último parámetro será la operación matemática a realizar. El método devolverá el resultado
    de dicha operación ( +, -, *, / ).
     */
    public static double calcular(int num1, int num2, char operacion) {
        double resultado = 0;

        switch (operacion) {
            case '+':
                System.out.println("Operacion: Sumar");
                resultado = num1 + num2;
                break;
            case '-':
                System.out.println("Operacion: Restar");
                resultado = num1 - num2;
                break;
            case '*':
                System.out.println("Operacion: Multiplicar");
                resultado = num1 * num2;
                break;
            case '/':
                System.out.println("Operacion: Dividir");
                if (validar(num2)) {
                    System.out.println("No se puede dividir por 0");
                } else {
                    resultado = num1 / num2;
                }
                break;
        }
        return resultado;
    }

    /*
    validar (privado): Recibirá como parámetro al segundo operando de la función calcular. Este método se debe utilizar sólo
    cuando la operación elegida sea la DIVISIÓN. Este método devolverá true si el operando es distinto de cero, false caso
    contrario.

     */
    private static boolean validar(int num) {
        if (num == 0) {
            return true;
        } else {
            return false;
        }
    }

}
