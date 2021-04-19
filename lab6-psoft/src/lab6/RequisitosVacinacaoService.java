package lab6;


public class RequisitosVacinacaoService {
    RequisitosVacinacao requisitosVacinacao = new RequisitosVacinacao();

    public void setIdadeMinima(Integer idade) {
        requisitosVacinacao.setIdadeMinima(idade);
    }

    public void addComorbidade(String comorbidade) {
        requisitosVacinacao.addComorbidade(comorbidade);
    }

    public void addProfissao(String profissao) {
        requisitosVacinacao.addProfissao(profissao);
    }

    public String toString(){ return requisitosVacinacao.toString();}


    public RequisitosVacinacao getRequisitosVacinacao() {
        return requisitosVacinacao;
    }
}
