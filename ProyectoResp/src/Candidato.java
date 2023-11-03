
import java.util.Scanner;

public class Candidato extends Ciudadano {
    private String ideologiaP;
    private String partidoP;
    private String promesas;

    public Candidato(String id, String nombre, String ciudad, String ideologiaP, String partidoP, String promesas) {
        super(id, nombre, ciudad);
        this.ideologiaP = ideologiaP;
        this.partidoP = partidoP;
        this.promesas = promesas;
    }

    public static Candidato crearC() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre del candidato: ");
            String nombre = scanner.nextLine();

            System.out.print("Cédula del candidato: ");
            String id = scanner.nextLine();

            System.out.print("Ciudad de origen del candidato: ");
            String ciudad = scanner.nextLine();

            System.out.print("Posición política del candidato: ");
            String ideologiaP = scanner.nextLine();

            System.out.print("Partido político del candidato: ");
            String partidoP = scanner.nextLine();
            
            System.out.print("cuales son sus promesas (si son mas de una separelas co comas): ");
            String promesas = scanner.nextLine();

            return new Candidato(nombre, id, ciudad, ideologiaP, partidoP, promesas);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPosición política='" + ideologiaP + '\'' +
                ", Partido político='" + partidoP + '\'' +
                ", Promesas de campaña=" + promesas;
    }
}


    
        
