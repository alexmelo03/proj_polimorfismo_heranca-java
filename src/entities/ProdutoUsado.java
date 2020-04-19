package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date data;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, Double preco, Date data) {
		super(nome, preco);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String Etiqueta() {
		return getNome()
				+ " (usado) R$ "
				+ String.format("%.2f" , getPreco())
				+ " (Data de fabricação: "
				+ sdf.format(data)+")";
	}
	

	
}
