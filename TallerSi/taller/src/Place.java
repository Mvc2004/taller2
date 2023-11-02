import java.util.ArrayList;
import java.util.List;

public class Place {
    private List<Platos> menu;
    private List<Platos> carrito;

    public Place() {
        menu = new ArrayList<>();
        carrito = new ArrayList<>();
        menucito();
    }

    private void menucito() {
        menu.add(new Platos("Lasaña", "Una deliciosa lasaña casera con carne y queso", "plato fuerte", 10, 15));
        menu.add(new Platos("Pizza Margarita", "Pizza con salsa de tomate, mozzarella y albahaca", "plato fuerte", 12, 20));
        menu.add(new Platos("limonada", "bebida", "agua con limon y azuzar", 5, 10));
        menu.add(new Platos("Sushi Variado", "Surtido de sushi con pescado fresco y arroz", "plato fuerte", 15, 25));
        menu.add(new Platos("Filete Mignon", "Filete de ternera a la parrilla con guarnición", "plato fuerte", 18, 30));
    }

    public void agregarAlCarrito(Platos plato, int cantidad) throws Exception {
        if (cantidad > 5) {
            throw new Exception("no puede llevar  mas de 5 unidades del mimso plato HAMBRIENTO");
        }

        carrito.add(plato);
    }

    public List<Platos> getMenu() {
        return menu;
    }

    public String factura() throws Exception {
        if (carrito.isEmpty()) {
            throw new Exception("El carrito está vacío. Debes seleccionar al menos un plato.");
        }

        double costoTotal = 0;
        int tiempoTotal = 0;
        boolean pedirbebida = false;

        StringBuilder factura = new StringBuilder();
        factura.append("Facturita:\n");

        for (Platos plato : carrito) {
            costoTotal += plato.getCosto();
            tiempoTotal += plato.getTiempo();

            factura.append(plato.getNombre()).append(" - $").append(plato.getCosto()).append("\n");

            if (plato.getTipo().equals("bebida")) {
                pedirbebida = true;
            }
        }

        factura.append("Valor Total: $").append(costoTotal).append("\n");
        factura.append("Tiempo Total: ").append(tiempoTotal).append(" minutos\n");

        if (costoTotal > 200000) {
            throw new Exception("Gastar tanto un un almuerzo no es normal, revisate porfa");
        } else if (!pedirbebida && carrito.stream().anyMatch(p -> p.getTipo().equals("bebida"))) {
            throw new Exception("No has pedido una bebida. ¿comer sin bebida? !weird!");
        }

        return factura.toString();
    }
}

