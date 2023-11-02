import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearI();
            }
        });
    }

    public static void crearI() {
        JFrame frame = new JFrame("RESTAURANTE MILY :) ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JPanel panel = new JPanel();

        
        frame.add(panel);

        Place restaurant = new Place();

        JComboBox<Platos> menuPlatos = new JComboBox<>();
        List<Platos> menu = restaurant.getMenu();
        for (Platos plato : menu) {
            menuPlatos.addItem(plato);
        }

        JTextField cantidadd = new JTextField(5);

        JButton agregar = new JButton("Agregar al Carrito ;) ");
        JButton pagar = new JButton("Pagar <3");

        agregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Platos platoE = (Platos) menuPlatos.getSelectedItem();
                    int cantidad = Integer.parseInt(cantidadd.getText());
                    restaurant.agregarAlCarrito(platoE, cantidad);
                    JOptionPane.showMessageDialog(frame, "Plato agregado al carrito: " + platoE.getNombre() + " x" + cantidad);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String factura = restaurant.factura();
                    JOptionPane.showMessageDialog(frame, factura, "GRACIAS POR SU COMPRA", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(new JLabel("Plato:"));
        panel.add(menuPlatos);
        panel.add(new JLabel("Cantidad:"));
        panel.add(cantidadd);
        panel.add(agregar);
        panel.add(pagar);

        frame.setVisible(true);
    }
}
