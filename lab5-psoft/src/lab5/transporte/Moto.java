package lab5.transporte;

import lab5.Transporte;

public class Moto extends Transporte {

    public Moto() {
        rota = calcularRota();
    }

    public String mensagemRota() {
        return "Calculando rota de Moto...";
    }
}
