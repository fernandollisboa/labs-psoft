package lab5.transporte;

import lab5.Transporte;

public class Onibus extends Transporte {
    public Onibus() {
        rota = calcularRota();
    }

    @Override
    public String mensagemRota() {
        return "Calculando rota de Ônibus...";
    }
}

