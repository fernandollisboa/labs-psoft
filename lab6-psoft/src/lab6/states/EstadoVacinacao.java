package lab6.states;

import lab6.Pessoa;
import lab6.RequisitosVacinacao;
import lab6.RequisitosVacinacaoService;

public abstract class EstadoVacinacao {
    protected RequisitosVacinacao requisitosVacinacao;
    EstadoVacinacao(){};

    EstadoVacinacao(RequisitosVacinacao requisitosVacinacao){
        this.requisitosVacinacao = requisitosVacinacao;
    }

    public void setRequisitoVacinacao(RequisitosVacinacao requisitosVacinacao){
        this.requisitosVacinacao = requisitosVacinacao;
    }

    public abstract void avancarEstado(Pessoa pessoa);
    public abstract String message();
}
