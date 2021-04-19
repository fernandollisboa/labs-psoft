package lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RequisitosVacinacao {
    private Integer idadeMinima;
    private Set<String> comorbidades;
    private Set<String> profissoes;

    public RequisitosVacinacao() {
        this.idadeMinima = 60;
        this.comorbidades = new HashSet<String>();
        this.profissoes = new HashSet<String>();
    }

    public void setIdade(Integer idade) {
        this.idadeMinima = idade;
    }

    public void addComorbidade(String comorbidade) {
        this.comorbidades.add(comorbidade);
    }

    public void addProfissao(String profissao) {
        this.profissoes.add(profissao);
    }

    public Integer getIdadeMinima() {
        return this.idadeMinima;
    }

    public Set<String> getComorbidade() {
        return comorbidades;
    }

    public Set<String> getProfissoes() {
        return profissoes;
    }

    public String comorbidadesToString() {
        return comorbidades.toString();
    }

    public String profissoesToString() {
        return profissoes.toString();
    }

    public boolean podeTomarPrimeiraDose(Pessoa pessoa) {
       return verificaIdade(pessoa.getIdade()) || verificaProfissao(pessoa.getProfissao()) || verificaComorbidade(pessoa.getComorbidades());
    }

    public boolean podeTomarSegundaDose(Pessoa pessoa){
        return verificaTempoPrimeiraDose(pessoa.getDataPrimeiraDose());
    }

    private boolean verificaTempoPrimeiraDose(LocalDate dataPrimeiraDose){
        return (Period.between(dataPrimeiraDose,LocalDate.now()).getDays() > 20);
    }

    private boolean verificaIdade(int idade){
        return idade > getIdadeMinima();
    }

    private boolean verificaProfissao(String profissao){
        return getProfissoes().contains(profissao);
    }

    private boolean verificaComorbidade(List<String> comorbidades){
        for(String comorbidade : comorbidades){
            if(this.comorbidades.contains(comorbidade)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Para ser vacinada, a pessoa deve apresentar um dos seguintes requisitos\n" +
                "idade maior que " + idadeMinima +
                " OU alguma dessas comorbidades:" + comorbidades +
                " OU alguma dessas profissões:" + profissoes;
    }
}

