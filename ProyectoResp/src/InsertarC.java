import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertarC {

    public static void insertarCandi() {
        List<Candidato> listaCandidatos = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de candidatos que desea insertar: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < cantidad; i++) {
                System.out.println("\nIngrese la información para el candidato " + (i + 1) + ":");
                System.out.print("ID: ");
                String id = scanner.nextLine();

                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ciudad: ");
                String ciudad = scanner.nextLine();

                System.out.print("Ideologias (izquierda, derecha o centro): ");
                String ideologias = scanner.nextLine();

                System.out.print("Partido político: ");
                String partidoP = scanner.nextLine();

                System.out.print("Cuales son sus propuestas: ");
                String promesas = scanner.nextLine();

                // Crear un nuevo Candidato y agregarlo a la lista
                Candidato nuevoC = new Candidato(id, nombre, ciudad, ideologias, partidoP, promesas);
                listaCandidatos.add(nuevoC);
            }

            // Llamar a la función para imprimir los candidatos
            mostrarCandidatos(listaCandidatos);
        }
    }

    public static void mostrarCandidatos(List<Candidato> candidatos) {
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }
    }

}




    

