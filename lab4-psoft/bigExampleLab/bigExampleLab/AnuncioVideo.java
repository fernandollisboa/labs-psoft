package bigExampleLab;

public class AnuncioVideo extends Anuncio{
    public AnuncioVideo(String descricao) {
        super(descricao);
    }
    @Override
    public double calculaPreco(int dias) {
        return dias * 3;
    }
}
