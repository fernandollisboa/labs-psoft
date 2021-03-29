package bigExampleLab;


import java.util.Enumeration;
import java.util.Vector;


class Cliente {
	private String nome;
	private Vector compras = new Vector();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void addCompra(bigExampleLab.Compra arg) {
		compras.addElement(arg);
	}

	public String getNome() {
		return nome;
	}

	private double calculaPrecoCompras(){
		double total = 0;
		Enumeration comprasAnuncio = compras.elements();
		while (comprasAnuncio.hasMoreElements()) {
			Compra currentCompra = (Compra) comprasAnuncio.nextElement();
			total += currentCompra.calculaPreco();
		}
		return total;
	}

	private int calculaPontosFrequentes(){
		int pontosFrequentes = 0;
		Enumeration comprasAnuncio = compras.elements();
		while (comprasAnuncio.hasMoreElements()) {
			Compra currentCompra = (Compra) comprasAnuncio.nextElement();
			pontosFrequentes++;
			if ((currentCompra.getCodigoPrecoAnuncio() == Anuncio.VIDEO) && currentCompra.getDiasAnuncio() > 1)
				pontosFrequentes++;
		}
		return pontosFrequentes;
	}

	private String getDescricaoCompras(){
		String resultado = "";
		Enumeration comprasAnuncio = compras.elements();
		while (comprasAnuncio.hasMoreElements()) {
			Compra currentCompra = (Compra) comprasAnuncio.nextElement();
			double preco = currentCompra.calculaPreco();
			resultado += "    " + currentCompra.getDescricaoAnuncio() + "    " + String.valueOf(preco) + "\n";
		}
		return resultado;
	}

	public String imprimeHistorico() {
		String resultado = "Historico de compras de anuncios por " + getNome() + "\n";
		resultado += getDescricaoCompras();
		resultado += "Total devido é " + String.valueOf(calculaPrecoCompras()) + "\n";
		resultado += "Voce ganhou " + String.valueOf(calculaPontosFrequentes()) + " pontos";
		return resultado;
	}

}