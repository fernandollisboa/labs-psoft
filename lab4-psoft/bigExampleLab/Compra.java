package bigExampleLab;

class Compra {
    private Anuncio anuncio;
    private int diasAnuncio;

    public Compra(Anuncio anuncio, int diasAnuncio) {
        this.anuncio = anuncio;
        this.diasAnuncio = diasAnuncio;
    }

    public double calculaPreco() {
        double totalParcial = 0;
        switch (anuncio.getCodigoPreco()) {
            case Anuncio.IMAGEM:
                totalParcial += 2;
//                if (getDiasAnuncio() > 2)
                    break;

            case Anuncio.VIDEO:
                totalParcial += getDiasAnuncio() * 3;
                break;

            case Anuncio.TEXTO:
                totalParcial += 1.5;
                if (getDiasAnuncio() > 3)
                    totalParcial += (getDiasAnuncio() - 3) * 1.5;
                break;
        }
        return totalParcial;
    }

    public int getDiasAnuncio() {
        return diasAnuncio;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public int getCodigoPrecoAnuncio(){
        return anuncio.getCodigoPreco();
    }

    public String getDescricaoAnuncio(){
        return anuncio.getDescricao();
    }
}