package stream;

import java.util.Comparator;

import lambda_expressions.Produto;

public class OrdenaProdutoPorPreco implements Comparator<Produto> {

	public int compare(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}
}
