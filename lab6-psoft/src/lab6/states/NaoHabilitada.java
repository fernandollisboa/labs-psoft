package lab6.states;

import lab6.Pessoa;
import lab6.RequisitosVacinacao;

public class NaoHabilitada extends EstadoVacinacao{
    protected RequisitosVacinacao requisitosVacinacao = new RequisitosVacinacao();

    @Override
    public void avancarEstado(Pessoa pessoa) {
        if (requisitosVacinacao.podeTomarPrimeiraDose(pessoa)) {
            pessoa.setEstadoVacinacao(new HabPrimeiraDose());
        }
    }

    @Override
    public String message() {
        return "Ainda não habilitado para vacinação";
    }
}
