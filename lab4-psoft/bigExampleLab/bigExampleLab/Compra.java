package bigExampleLab;

class Compra {
    private Anuncio anuncio;
    private int diasAnuncio;

    public Compra(Anuncio anuncio, int diasAnuncio) {
        this.anuncio = anuncio;
        this.diasAnuncio = diasAnuncio;
    }

    public double calculaPreco() {
        return anuncio.calculaPreco(diasAnuncio);
    }

    public int getDiasAnuncio() {
        return diasAnuncio;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public String getDescricaoAnuncio(){
        return anuncio.getDescricao();
    }
}