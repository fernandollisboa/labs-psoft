package lab6;

import lab6.PessoaRepository;
import lab6.PessoaService;
import lab6.states.EstadoVacinacao;
import lab6.states.HabPrimeiraDose;
import lab6.states.NaoHabilitada;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SistemaVacinacao {
    private PessoaService pessoaService;
    private RequisitosVacinacao requisitosVacinacao;

    public SistemaVacinacao() {
        this.pessoaService = new PessoaService();
        this.requisitosVacinacao = new RequisitosVacinacao();
    }


}