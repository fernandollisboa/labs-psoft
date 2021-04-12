package lab5;

public abstract class Transporte {
    protected Rota rota;
    public Rota calcularRota(){ return new Rota();};
    public abstract String mensagemRota();
}
