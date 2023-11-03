import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static int mostrarM() {
        System.out.println("----- Menú -----");
        System.out.println("1. Insertar candidato(s)");
        System.out.println("2. Listar candidatos");
        System.out.println("3. Actualizar candidato");
        System.out.println("4. Eliminar candidato");
        System.out.println("5. Buscar candidato por nombre");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
}
