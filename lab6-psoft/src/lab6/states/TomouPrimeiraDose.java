package lab6.states;

import lab6.Pessoa;
import lab6.RequisitosVacinacao;

public class TomouPrimeiraDose extends EstadoVacinacao{
    RequisitosVacinacao requisitosVacinacao = new RequisitosVacinacao();

    @Override
    public void avancarEstado(Pessoa pessoa) {
        if (requisitosVacinacao.podeTomarSegundaDose(pessoa)) {
            pessoa.setEstadoVacinacao(new HabSegundaDose());
        }
    }

    @Override
    public String message() {
        return "Primeira dose já aplicada";
    }
}
