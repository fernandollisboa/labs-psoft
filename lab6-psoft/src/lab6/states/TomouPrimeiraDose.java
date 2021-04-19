package lab6.states;

import lab6.Pessoa;

public class TomouPrimeiraDose implements EstadoVacinacao{
    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new HabSegundaDose());
    }
}
