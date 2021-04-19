package lab6.states;

import lab6.Pessoa;
import lab6.RequisitosVacinacao;
import lab6.RequisitosVacinacaoService;

public class NaoHabilitada extends EstadoVacinacao{

    public NaoHabilitada(RequisitosVacinacao requisitosVacinacao) {
        super(requisitosVacinacao);
    }

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
