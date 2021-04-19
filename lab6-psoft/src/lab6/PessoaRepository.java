package lab6;


import java.util.*;

public class PessoaRepository{
    private Map<String, Pessoa> pessoaMap;

    public PessoaRepository() {
        this.pessoaMap = new HashMap<>();
    }

    public void salvaPessoa(Pessoa pessoa){
        pessoaMap.put(pessoa.getCpf(),pessoa);
    }


    public Optional<Pessoa> getPessoaByCpf(String cpf){
        return Optional.ofNullable(pessoaMap.get(cpf));
    }

    public Collection<Pessoa> getPessoaMap() {
        return pessoaMap.values();
    }
    
}
