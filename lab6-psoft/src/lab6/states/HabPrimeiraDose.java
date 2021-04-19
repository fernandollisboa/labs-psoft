package lab6.states;

import lab6.Pessoa;
import lab6.RequisitosVacinacao;

public class HabPrimeiraDose extends EstadoVacinacao {

    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setEstadoVacinacao(new TomouPrimeiraDose());
    }

    @Override
    public String message() {
        return "Habilitado para Primeira Dose";
    }
}
