public class Ciudadano {
    
    protected String id;
    private String nombre;
    protected String ciudad;
   

    public Ciudadano(String id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}

