package entities;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	
	
	public double valorTotal() {
		return getPreco() + taxaAlfandega;
	}
	
	@Override
	public String Etiqueta() {
		return getNome() + " R$ "+ String.format("%.2f" , valorTotal()) +
				" (Taxa de alfandega: R$ "+ String.format("%.2f", taxaAlfandega)+")";
	}
	

}
