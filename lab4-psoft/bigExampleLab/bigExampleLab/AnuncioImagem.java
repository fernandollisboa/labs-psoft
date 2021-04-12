package bigExampleLab;

public class AnuncioImagem extends Anuncio{
    public AnuncioImagem(String descricao) {
        super(descricao);
    }

    @Override
    public double calculaPreco(int dias) {
        double preco = 2;
        if (dias > 2)
            preco += (dias - 2) * 1.5;
        return preco;
    }
}
