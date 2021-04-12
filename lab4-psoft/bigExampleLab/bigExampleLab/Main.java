package bigExampleLab;

public class Main {
    public static void main(String[] args) {
        Anuncio anuncio1 = new AnuncioTexto("Anúncio de Imagem");
        Anuncio anuncio2 = new AnuncioImagem("Anúncio de Vídeo");
        Anuncio anuncio3 = new AnuncioVideo("Anúncio de Imagem");

        Compra compra1 = new Compra(anuncio1,1);
        Compra compra2 = new Compra(anuncio2, 2);
        Compra compra3 = new Compra(anuncio3,3);

        Cliente cliente = new Cliente("Cliente Jackson");
        cliente.addCompra(compra1);
        cliente.addCompra(compra2);
        cliente.addCompra(compra3);

        System.out.println(cliente.imprimeHistorico());
    }
}
