package bigExampleLab;

public abstract class Anuncio {
	Anuncio(String descricao){
		this.descricao = descricao;
	}
	protected String descricao;
	protected double preco;

	public String getDescricao (){
		return descricao;
	}
	public abstract double calculaPreco(int dias);
}