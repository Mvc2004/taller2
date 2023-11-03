package modelo;

public class Calculadora {
    
private int numero1, numero2, resultados;

public int getNumero1() {
    return numero1;
}

public void setNumero1(int numero1) {
    this.numero1 = numero1;
}

public int getNumero2() {
    return numero2;
}

public void setNumero2(int numero2) {
    this.numero2 = numero2;
}

public int getResultados() {
    return resultados;
}

public void setResultados(int resultados) {
    this.resultados = resultados;
}

public int sumar(){
    resultados = numero1+numero2;
    return resultados;
}

public int restar(){
    resultados = numero1-numero2;
    return resultados;
}

}
