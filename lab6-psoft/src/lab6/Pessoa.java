package lab6;

import lab6.states.EstadoVacinacao;
import lab6.states.NaoHabilitada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
    private Date dataPrimeiraDose;

    public Pessoa(String nome, String cpf, String endereco, String numCartaoSus, String email, String telefone, String profissao, List<String> comorbidades) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numCartaoSus = numCartaoSus;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = new ArrayList<>();
        this.estadoVacinacao = new NaoHabilitada();

        this.comorbidades.addAll(comorbidades);
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumCartaoSus() {
        return numCartaoSus;
    }

    public void setNumCartaoSus(String numCartaoSus) {
        this.numCartaoSus = numCartaoSus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
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

    public void setEstadoVacinacao(EstadoVacinacao estadoVacinacao) {
        this.estadoVacinacao = estadoVacinacao;
    }

    public Date getDataPrimeiraDose() {
        return dataPrimeiraDose;
    }

    public void setDataPrimeiraDose(Date dataPrimeiraDose) {
        this.dataPrimeiraDose = dataPrimeiraDose;
    }
}
