import controlador.ControladorCalcuadora;
import modelo.Calculadora;
import vista.VistaConsola;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        VistaConsola vista = new VistaConsola();
        ControladorCalcuadora controlador = new ControladorCalcuadora(calculadora, vista);
        controlador.inicializador();
    }
}
