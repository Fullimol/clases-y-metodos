/*
[B.09] - El tiempo pasa...
Crear un método estático que reciba una fecha y calcule el número de días que pasaron desde esa fecha hasta la fecha
actual. Tener en cuenta los años bisiestos.
Pedir por consola la fechadenacimientode una persona (día, mes y año) y calcule el númerodedíasvividospor esa persona
hasta la fecha actual utilizando el método desarrollado anteriormente.

Ayudarse con las funcionalidades del tipo LocalDateTime para resolver el ejercicio.
 */
package ejercicioB9;


public class Main {
    public static void main(String[] args) {
        
    }
    
    
    private static boolean esBisiestro(int anio){
        /*
        Si el año es divisible por 4, se verifica si también es divisible por 100. Si es así, el año podría no ser bisiesto. 
        Si el año es divisible por 100, se verifica si también es divisible por 400. 
        Si es divisible por 400, el año es bisiesto (true), de lo contrario, no lo es (false).
        */
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                return anio % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    } 
}
