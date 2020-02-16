package lambda_references;

import java.util.ArrayList;
import java.util.List;

import lambda_expressions.Produto;

public class exemplo01 {
	
	public static void main(String[] args) {
		
		//Exemplo com expression lambda
		Figura2D fg1 = (l,a)->System.out.println("Desenhando figura com largura "+l+" e altura "+a);
		fg1.desenha(8.0, 3.0);
		
		//Usando metodo reference representado por :: 
		//Classe ou objeto :: metodo referenciado
		Retangulo ret = new Retangulo();
		Figura2D fg2 = ret::desenhaRetangulo;
		
		fg2.desenha(10.0, 6.0);
		
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto("TV 42",2000.00));
		lista.add(new Produto("Fogão 4 bocas",499.00));
		lista.add(new Produto("Videogame",2499.00));
		lista.add(new Produto("Microondas",399.00));
		
		lista.forEach(Produto::imprime);
		
		Figura2D fg3 = Retangulo::new;
		
		fg3.desenha(8.5,6.5);
		
		
		
	}
	
	

}
