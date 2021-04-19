package lab6.states;

import lab6.Pessoa;

import java.time.LocalDate;

public class HabPrimeiraDose extends EstadoVacinacao {

    @Override
    public void avancarEstado(Pessoa pessoa) {
        pessoa.setDataPrimeiraDose(LocalDate.now());
        pessoa.setEstadoVacinacao(new TomouPrimeiraDose());
    }

    @Override
    public String message() {
        return "Habilitado para tomar primeira dose";
    }
}
