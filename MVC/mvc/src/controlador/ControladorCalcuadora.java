package controlador;

import modelo.Calculadora;
import vista.VistaGeneral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorCalcuadora implements ActionListener {

    Calculadora calculadora;
    VistaGeneral vista;
    Operacion operacion;
    public ControladorCalcuadora(Calculadora calculadora, VistaGeneral vista) {
        this.calculadora = calculadora;
        this.vista = vista;
    }
    public Operacion getOperacion() {
        return operacion;
    }
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        calculadora.setNumero1(Integer.parseInt(vista.getNumero1()));
        calculadora.setNumero2(Integer.parseInt(vista.getNumero2()));
        switch (operacion) {
            case SUMA:
                calculadora.sumar();
                break;
             case RESTA:
                calculadora.restar();
                break;
        }

        vista.setResultado(calculadora.getResultados() + "");
        
    }

    public  void inicializador(){
        vista.iniciar(this);
    }

    
}
