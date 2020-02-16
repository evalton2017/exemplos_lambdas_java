package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lambda_expressions.Produto;

public class Exemplo {
	
	public static void main(String[] args) {
	List<Produto> produtos = new ArrayList<Produto>();
		
	produtos.add(new Produto("TV Samsung 42",2000.00));
	produtos.add(new Produto("Fogão 4 bocas",499.00));
	produtos.add(new Produto("Videogame",2499.00));
	produtos.add(new Produto("Microondas",399.00));
	produtos.add(new Produto("Geladeira Consul",1399.00));
	produtos.add(new Produto("Geladeira Brastemp",2399.00));
	produtos.add(new Produto("Geladeira Duke",3399.00));
	produtos.add(new Produto("TV Panasonic 42",1999.00));
		
		//#########MANEIRA CONVENCIONAL ############################		
		//lista de geladeiras
		List<Produto> listaGeladeiras = new ArrayList<Produto>();
		for(Produto p: produtos) {
			if(p.getNome().contains("Geladeira")) {
				listaGeladeiras.add(p);
			}
		}		
		//Ordena a lista
		Collections.sort(produtos,new OrdenaProdutoPorPreco());
				//Lista dos nome das geladeiras 
		List<String> listaNomeGeladeiras = new ArrayList<String>();
		for(Produto p: listaGeladeiras) {
			listaNomeGeladeiras.add(p.getNome().toUpperCase());
		}
				//Existe os nomes das geladeiras
		for(String nome: listaNomeGeladeiras) {
			System.out.println(nome);
		}
				
		//######USANDO STREAM ######################################
		System.out.println("Usando Stream ");
		produtos.stream().filter(p->p.getNome().contains("Geladeira"))
		.sorted((p1,p2)->p1.getPreco()
				.compareTo(p2.getPreco()))
					.map(p->p.getNome().toUpperCase()).forEach(System.out::println);
		
	}
	
	
	

}
