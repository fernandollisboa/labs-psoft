package bigExampleLab;

public class Anuncio {

	public static final int TEXTO = 2;
	public static final int IMAGEM = 0;
	public static final int VIDEO = 1;

	private String descricao;
	private int codigoPreco;

	public Anuncio(String descricao, int codigoPreco) {
		this.descricao = descricao;
		this.codigoPreco = codigoPreco;
	}
	public int getCodigoPreco() {
		return codigoPreco;
	}

	public void setCodigoPreco(int arg) {
		codigoPreco = arg;
	}
	public String getDescricao (){
		return descricao;
	}
}