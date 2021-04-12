package lab5.transporte;

import lab5.Transporte;

public class Metro extends Transporte {
    public Metro() {
        rota = calcularRota();
    }

    @Override
    public String mensagemRota() {
        return "Calculando rota de Metrô...";
    }
}
