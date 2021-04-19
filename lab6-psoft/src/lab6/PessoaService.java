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
    }

    public void setEndereco(String endereco, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setEndereco(endereco);
    }

    public void setEmail(String email,String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setEmail(email);
    }

    public void setTelefone(String telefone, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setTelefone(telefone);
    }

    public void setProfissao(String profissao, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.setProfissao(profissao);
    }

    public void adicionaComorbidade(String comorbidade, String cpf){
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.addComorbidade(comorbidade);
    }

    public void removeComorbidade(String comorbidade, String cpf) {
        Pessoa pessoa = getPessoaCPF(cpf);
        pessoa.removeComorbidade(comorbidade);
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
