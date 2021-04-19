package lab6.states;

import lab6.Pessoa;

public class FinalizadaVacinacao extends EstadoVacinacao {
    @Override
    public void avancarEstado(Pessoa pessoa) {
    }

    @Override
    public String message() {
        return "Vacinação Finalizada! :)";
    }
}
