package tareacolas;

import static tareacolas.Metodos.*;

public class tareacolas{

    public static int first = -1;
    public static int last = -1;
    public static int max;
    public static int cola[];

    public static void main(String[] args) {
        System.out.println("--- Colas No circulares ---");
        int tamaño = inputTamaño("Ingrese el tamaño de la cola");
        cola = new int[tamaño];
        max = tamaño - 1;

        while(true){
            System.out.println("============");
            menu();
            int eleccion = inputIntPositivo("Ingrese su opcion");

            switch (eleccion) {
                case 1 -> insertar();
                case 2 -> eliminar();
                case 3 -> mostrar();
                case 4 -> System.out.println("Saliendo de la aplicacion..-");
 
                default -> {
                    mostrarError("Opcion invalida");
                    break;
                }
            }

            if(eleccion == 4){
                break;
            }
        }

        
    }

}