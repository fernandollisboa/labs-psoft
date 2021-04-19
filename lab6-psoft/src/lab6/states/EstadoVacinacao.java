package lab6.states;

import lab6.Pessoa;

public interface EstadoVacinacao {
    void avancarEstado(Pessoa pessoa);
    String toString();
}
