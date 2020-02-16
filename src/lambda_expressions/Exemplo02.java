package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
	
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto("TV 42",2000.00));
		lista.add(new Produto("Fogão 4 bocas",499.00));
		lista.add(new Produto("Videogame",2499.00));
		lista.add(new Produto("Microondas",399.00));
		
		lista.forEach((p)-> System.out.println("Nome "+p.getNome()+"Preço "+p.getPreco()));
		
		lista.sort((p1,p2)-> p1.getPreco().compareTo(p2.getPreco()));
		
		System.out.println("#########Lista Ordenada ##############");
		lista.forEach((p)-> System.out.println("Nome "+p.getNome()+"Preço "+p.getPreco()));
		
	}

}
