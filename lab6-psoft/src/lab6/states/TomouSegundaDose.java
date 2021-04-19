package lab6.states;

import lab6.Pessoa;

public class TomouSegundaDose implements EstadoVacinacao {
    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new FinalizadaVacinacao());
    }
}
