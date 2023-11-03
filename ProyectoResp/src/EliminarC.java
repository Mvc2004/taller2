import java.util.Iterator;
import java.util.List;

public class EliminarC {

    private List<Candidato> listaCandidatos;

    public EliminarC(List<Candidato> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public void eliminarCandidato(String id) {
        Iterator<Candidato> iterator = listaCandidatos.iterator();
        while (iterator.hasNext()) {
            Candidato candidato = iterator.next();
            if (candidato.getId().equals(id)) {
                iterator.remove();
                System.out.println("Candidato con ID " + id + " eliminado.");
                return;
            }
        }
        System.out.println("No se encontró ningún candidato con el ID " + id + ".");
    }

    public void mostrarCandidatos() {
        System.out.println("Lista de candidatos:");
        for (Candidato candidato : listaCandidatos) {
            System.out.println(candidato);
        }
    }
}

