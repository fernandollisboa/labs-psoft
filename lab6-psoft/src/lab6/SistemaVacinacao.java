package lab6;

import lab6.PessoaRepository;
import lab6.PessoaService;

public class SistemaVacinacao {
    private PessoaService pessoaService;
    private PessoaRepository pessoaRepository;

    public SistemaVacinacao() {
        this.pessoaService = new PessoaService();
        this.pessoaRepository = new PessoaRepository();
    }

    public void avancaEstadoVacinacao(){

    }
}
