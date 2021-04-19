package lab6;

import java.util.HashSet;
import java.util.Set;

public class RequisitosVacinacao {
    private Integer idade;
    private Set<String> comorbidades;
    private Set<String> profissoes;

    public RequisitosVacinacao() {
        this.idade = 60;
        this.comorbidades = new HashSet<String>();
        this.profissoes = new HashSet<String>();
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void addComorbidade(String comorbidade) {
        this.comorbidades.add(comorbidade);
    }

    public void addProfissao(String profissao) {
        this.profissoes.add(profissao);
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Set<String> getComorbidade() {
        return comorbidades;
    }

    public Set<String> getProfissao() {
        return profissoes;
    }

    public String comorbidadesToString() {
        return comorbidades.toString();
    }

    public String profissoesToString() {
        return profissoes.toString();
    }

    @Override
    public String toString() {
        return "Para ser vacinada, a pessoa deve apresentar um dos seguintes requisitos\n" +
                "idade maior que " + idade +
                ", alguma dessas comorbidades:" + comorbidades +
                " ou alguma dessas profissoes:" + profissoes;
    }
}

