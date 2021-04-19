package lab6.states;

import lab6.Pessoa;

public class HabPrimeiraDose implements EstadoVacinacao{
    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new TomouPrimeiraDose());
    }
}
