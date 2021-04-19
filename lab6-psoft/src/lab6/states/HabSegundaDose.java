package lab6.states;

import lab6.Pessoa;

public class HabSegundaDose extends EstadoVacinacao{
    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new TomouSegundaDose());
    }

    @Override
    public String message() {
        return "Habilitado para tomar segunda dose";
    }
}
