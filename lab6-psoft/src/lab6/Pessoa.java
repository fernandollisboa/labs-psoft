package lab6;

import lab6.states.EstadoVacinacao;
import lab6.states.NaoHabilitada;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String numCartaoSus;
    private String email;
    private String telefone;
    private String profissao;
    private List<String> comorbidades;
    private EstadoVacinacao estadoVacinacao;
    private LocalDate dataPrimeiraDose;
    private LocalDate dataNasc;

    public Pessoa(String nome, String cpf, String endereco, String numCartaoSus, String email, String telefone, String profissao, List<String> comorbidades, LocalDate dataNasc, RequisitosVacinacao requisitosVacinacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numCartaoSus = numCartaoSus;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = new ArrayList<>();
        this.comorbidades.addAll(comorbidades);
        this.estadoVacinacao = new NaoHabilitada(requisitosVacinacao);
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstadoVacinacao(EstadoVacinacao estadoVacinacao){
        this.estadoVacinacao = estadoVacinacao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<String> getComorbidades() {
        return comorbidades;
    }

    public void addComorbidade(String comorbidade) {
        this.comorbidades.add(comorbidade);
    }

    public void removeComorbidade(String comorbidade){
        this.comorbidades.remove(comorbidade);
    }

    public EstadoVacinacao getEstadoVacinacao() {
        return estadoVacinacao;
    }

    public void avancaEstadoVacinacao(){
        this.estadoVacinacao.avancarEstado(this);
    }

    public LocalDate getDataPrimeiraDose() {
        return dataPrimeiraDose;
    }

    public void setDataPrimeiraDose(LocalDate dataPrimeiraDose) {
        this.dataPrimeiraDose = dataPrimeiraDose;
    }


    public Integer getIdade(){
        return Period.between(dataNasc, LocalDate.now()).getYears();
    }

    public void atualizaRequisitoVacinacao(RequisitosVacinacao requisitosVacinacao){
        this.estadoVacinacao.setRequisitoVacinacao(requisitosVacinacao);
    }
}
