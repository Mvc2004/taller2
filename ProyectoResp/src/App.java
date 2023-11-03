import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Candidato> candidatos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Menu.mostrarM();

            switch (opcion) {
                case 1:
                    InsertarC.insertarCandi();
                    break;
                case 2:
                    listarCandidatos();
                    break;
                case 3:
                    // Agrega aquí la lógica para actualizar candidato
                    break;
                case 4:
                    EliminarC;
                    break;
                case 5:
                    buscarCandidatoPorNombre();
                    break;
                case 6:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }

        } while (opcion != 6);
    }

    private static void listarCandidatos() {
        System.out.println("Listado de candidatos:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }
    }

}
