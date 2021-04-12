package bigExampleLab;

public enum AnuncioFactory {
    Texto{
        @Override
        public Anuncio criarAnuncio(String descricao) {
            return new AnuncioTexto(descricao);
        }
    }, Imagem{
        @Override
        public Anuncio criarAnuncio(String descricao) {
            return new AnuncioImagem(descricao);
        }
    }, Video{
        @Override
        public Anuncio criarAnuncio(String descricao) {
            return new AnuncioVideo(descricao);
        }
    };

    public abstract Anuncio criarAnuncio(String descricao);
}
