package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com número de produtos: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do produto #"+i+":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if(resp == 'c') {
				list.add(new Produto(nome, preco));
			}
			
			else if(resp == 'i') {
				System.out.print("taxa de alfândega: ");
				double taxaAlfandega = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
				
			}
			else {
					System.out.print("Data de fabicação: ");
					Date data = sdf.parse(sc.next());
					list.add(new ProdutoUsado(nome, preco, data));
					}
	
		}
		
		System.out.println();
		System.out.println("Etiquetas:");
		for(Produto produto : list) {
			System.out.println(produto.Etiqueta());
		}
		
		sc.close();

      }
}