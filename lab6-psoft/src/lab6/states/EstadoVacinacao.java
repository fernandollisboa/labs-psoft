package lab6.states;

import lab6.Pessoa;

public abstract class EstadoVacinacao {
    public abstract void avancarEstado(Pessoa pessoa);
    public abstract String message();
}
