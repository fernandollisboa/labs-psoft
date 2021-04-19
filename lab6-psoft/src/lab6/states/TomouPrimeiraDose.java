package lab6.states;

import lab6.Pessoa;

public class TomouPrimeiraDose extends EstadoVacinacao{
    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new HabSegundaDose());
    }

    @Override
    public String message() {
        return "Primeira dose já aplicada";
    }
}
