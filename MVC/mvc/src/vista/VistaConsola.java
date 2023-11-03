package vista;

import java.util.Scanner;

import controlador.ControladorCalcuadora;
import controlador.Operacion;

public class VistaConsola  implements VistaGeneral{

    String numero1, numero2;

    @Override
    public String getNumero1() {
       return numero1;
    }

    @Override
    public String getNumero2() {
        return numero2;
    }

    @Override
    public void setResultado(String resultado) {
        System.out.println("el resultado es:" + resultado);
       
    }

    @Override
    public void iniciar(ControladorCalcuadora controlador) {
        System.out.println("-----------------");
        System.out.println("WELCOME");
        System.out.println("seleciona la opcion");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("0. salir");
        try (Scanner scanner = new Scanner(System.in)) {
            String opcion = scanner.next();
            if(opcion.equals(0)){
                return;
            }

            if (opcion.equals("1")){
                controlador.setOperacion(Operacion.SUMA);

            }else if(opcion.equals("2")){
                controlador.setOperacion(Operacion.RESTA);
            } 

            System.out.println("escriba él numero");
            numero1 = scanner.next();
            System.out.println("escriba él otro numero");
            numero2 = scanner.next();
        }
        controlador.actionPerformed(null);
    

       
    }
    
}
