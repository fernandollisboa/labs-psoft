package lab6.states;

import lab6.Pessoa;

public class TomouSegundaDose extends EstadoVacinacao {
    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new FinalizadaVacinacao());
    }

    @Override
    public String message() {
        return "Segunda dose já aplicada";
    }
}
