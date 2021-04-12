package lab5.transporte;

import lab5.Transporte;

public class Pedestre extends Transporte {

    public Pedestre() {
        rota = calcularRota();
    }
    public String mensagemRota() {
        return "Calculando Rota de Pedestre...";
    }
}
