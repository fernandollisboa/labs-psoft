package bigExampleLab;

public abstract class Anuncio {

	protected String descricao;
	protected double preco;

	Anuncio(){

	}
	public Anuncio(String descricao, String codigoPreco) {
		this.descricao = descricao;
		switch (codigoPreco){
			case(0):
				new AnuncioImagem();
				break;
			case(1):
				new AnuncioVideo();
				break;
			case(2):
				new AnuncioTexto();
		}
		this.descricao = descricao;
	}

	public String getDescricao (){
		return descricao;
	}
	public abstract double calculaPreco(int dias);
}