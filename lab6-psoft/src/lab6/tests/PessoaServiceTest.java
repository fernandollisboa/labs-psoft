package lab6.tests;

import lab6.PessoaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PessoaServiceTest {
    PessoaService pessoaService = new PessoaService();

    @BeforeEach
    void povoaService(){
        LocalDate dataNasc = LocalDate.parse("1999-05-28");
        pessoaService.criaPessoa("fernando","12345678909","av coelho campos 23", "1111","fernando@hotmail","11324435","estudante de cc","asma , bronquite", dataNasc);

        dataNasc = LocalDate.parse("1959-06-01");
        pessoaService.criaPessoa("pedro","11111111111","av campos elisios 323", "1112","pedrinho@hotmail","114234435","aposentado","", dataNasc);

    }

    @Test
    void vacinarPessoasTest(){
        // Fernando nao pode ser vacinado antes de virar monitor de psoft
        assertEquals("Ainda não habilitado para vacinação",pessoaService.getMessageVacinacao("12345678909"));
        pessoaService.avancaEstadoDeVacinacao("12345678909");
        assertEquals("Ainda não habilitado para vacinação",pessoaService.getMessageVacinacao("12345678909"));

        pessoaService.setProfissao("monitor de psoft", "12345678909");
        pessoaService.avancaEstadoDeVacinacao("12345678909");
        assertEquals("Habilitado para tomar primeira dose",pessoaService.getMessageVacinacao("12345678909"));
        pessoaService.avancaEstadoDeVacinacao("12345678909");
        assertEquals("Primeira dose já aplicada",pessoaService.getMessageVacinacao("12345678909"));

        // pedro pode se vacinar por causa da idade ( >60 é o padrao)
        assertEquals("Ainda não habilitado para vacinação",pessoaService.getMessageVacinacao("11111111111"));
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        assertEquals("Habilitado para tomar primeira dose",pessoaService.getMessageVacinacao("11111111111"));
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        assertEquals("Primeira dose já aplicada",pessoaService.getMessageVacinacao("11111111111"));
    }
    @Test
    void verificaTempoVacinacaoSegundaDoseTest(){
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        assertEquals("Primeira dose já aplicada",pessoaService.getMessageVacinacao("11111111111"));

        pessoaService.setDataPrimeiraDose(LocalDate.parse("2021-03-20"), "11111111111");

        pessoaService.avancaEstadoDeVacinacao("11111111111");
        assertEquals("Habilitado para tomar segunda dose",pessoaService.getMessageVacinacao("11111111111"));
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        assertEquals("Segunda dose já aplicada",pessoaService.getMessageVacinacao("11111111111"));
        pessoaService.avancaEstadoDeVacinacao("11111111111");
        assertEquals("Vacinação Finalizada! :)",pessoaService.getMessageVacinacao("11111111111"));
    }

}
