package vista;

import controlador.ControladorCalcuadora;

public interface VistaGeneral{

    public  String getNumero1();
    public  String getNumero2();
    public void setResultado(String resultado);
    public void iniciar(ControladorCalcuadora controlador);

}