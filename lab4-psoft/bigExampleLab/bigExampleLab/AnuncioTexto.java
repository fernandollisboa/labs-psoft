package bigExampleLab;

public class AnuncioTexto extends Anuncio{
    AnuncioTexto(String descricao) {
        super(descricao);
    }

    @Override
    public double calculaPreco(int dias) {
        double preco = 1.5;
        if (dias > 3)
            preco += (dias- 3) * 1.5;
        return preco;
    }
}
