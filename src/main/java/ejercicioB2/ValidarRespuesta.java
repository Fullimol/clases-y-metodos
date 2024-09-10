package ejercicioB2;

import java.util.Scanner;

// este es lo que debe preguntar y verificar si se desea continuar o no.
public class ValidarRespuesta {

    public static boolean validarS_N() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea continuar? (s/n) ");
        String respuesta = scanner.nextLine();

        while (true) {
            if (respuesta.equals("s")) {
                return true;
            }
            if (respuesta.equals("n")) {
                return false;
            } else {
                System.out.println("Ingrese S o N en minuscula.");
            }
        }

    }
}
