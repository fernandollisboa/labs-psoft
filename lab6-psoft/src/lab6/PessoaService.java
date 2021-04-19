package lab6;

import java.time.LocalDate;
import java.util.*;

public class PessoaService {
    private PessoaRepository pessoaRepository;

    public Collection<Pessoa> getListPessoas(){
        return pessoaRepository.getPessoaMap();
    }

    public PessoaService(){
        this.pessoaRepository = new PessoaRepository();
    }

    public void criaPessoa(String nome, String cpf, String endereco,
                           String numCartaoSus, String email, String telefone,
                           String profissao, String comorbidades, LocalDate dataNasc) throws IllegalArgumentException {
        Optional<Pessoa> optionalPessoa = pessoaRepository.getPessoaByCpf(cpf);

        if(cpf == null) throw new NullPointerException("CPF não pode ser nulo!");

        if (optionalPessoa.isPresent()) {
            throw new IllegalArgumentException("Pessoa com esse CPF já cadastrada!");
        }

        List<String> comorbidadesList = Arrays.asList(comorbidades.split(","));

        Pessoa pessoa = new Pessoa(nome, cpf, endereco, numCartaoSus, email, telefone, profissao, comorbidadesList,dataNasc);

        pessoaRepository.salvaPessoa(pessoa);
    }

    public void setNome(String nome, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setNome(nome);
        atualizaPessoa(pessoa);
    }

    public void setEndereco(String endereco, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setEndereco(endereco);
        atualizaPessoa(pessoa);
    }

    public void setEmail(String email,String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setEmail(email);
        atualizaPessoa(pessoa);
    }

    public void setTelefone(String telefone, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setTelefone(telefone);
        atualizaPessoa(pessoa);
    }

    public void setProfissao(String profissao, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setProfissao(profissao);
        atualizaPessoa(pessoa);
    }

    public void adicionaComorbidade(String comorbidade, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.addComorbidade(comorbidade);
        atualizaPessoa(pessoa);
    }

    public void removeComorbidade(String comorbidade, String cpf) {
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.removeComorbidade(comorbidade);
        atualizaPessoa(pessoa);
    }

    public void setDataPrimeiraDose(LocalDate localDate, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setDataPrimeiraDose(localDate);
        atualizaPessoa(pessoa);
    }

    public void atualizaPessoa(Pessoa pessoa){
        pessoaRepository.atualizaPessoa(pessoa);
    }

    public Pessoa getPessoaCPF(String cpf) {
        Optional<Pessoa> optionalPessoa = pessoaRepository.getPessoaByCpf(cpf);

        if (!optionalPessoa.isPresent()) {
           throw new NullPointerException("Não existe pessoa cadastrada com esse CPF!");
        }

        return optionalPessoa.get();
    }

    public void avancaEstadoDeVacinacao(String cpf) {
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.avancaEstadoVacinacao();
    }

    public String getMessageVacinacao(String cpf) {
        Pessoa pessoa = getPessoaCPF(cpf);
        return pessoa.getEstadoVacinacao().message();
    }
}
