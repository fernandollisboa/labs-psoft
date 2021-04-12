package lab5.transporte;
import lab5.Transporte;

public class Carro extends Transporte {

    public Carro() {

        rota = calcularRota();
    }

    public String mensagemRota() {
        return  "Calculando Rota de Carro...";
    }
}
