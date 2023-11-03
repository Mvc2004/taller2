public class Profesores {

    protected String id;
    private String nombre;
    protected String materia;
   

    public Profesores(String id, String nombre, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.materia = materia;
    }

        // Getters
        public String getId() {
            return id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public String getMateria() {
            return materia;
        }
    
        // Setters
        public void setId(String id) {
            this.id = id;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public void setMateria(String materia) {
            this.materia = materia;
        }
}
