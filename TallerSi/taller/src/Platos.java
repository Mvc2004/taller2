
public class Platos {
    protected String nombre;
    protected String descrip;
    protected String tipo;
    protected int costo;
    protected int tiempo;

    public Platos(String nombre, String tipo, String descrip, int costo, int tiempo) {
        this.nombre = nombre;
        this.descrip = descrip;
        this.tipo = tipo;
        this.costo = costo;
        this.tiempo = tiempo;
    }

    // Getter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;}
}

