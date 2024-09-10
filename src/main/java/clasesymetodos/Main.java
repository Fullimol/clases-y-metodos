package clasesymetodos;

//iniciar aplicacion
public class Main {

    public static void main(String[] args) {
        // Crear una instancia del controlador para 10 numeros.
        ControladorNumeros controlador = new ControladorNumeros(10);

        // Llamar al metodo para ingresar numeros.
        controlador.ingresarNumero();

        // Mostrar el valor minimo, maximo y promedio.
        System.out.println("Valor minimo ingresado: " + controlador.getMinValor());
        System.out.println("Valor minimo ingresado: " + controlador.getMaxValor());
        System.out.println("Valor minimo ingresado: " + controlador.calcularPromedio());
    }
}