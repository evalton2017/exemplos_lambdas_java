package lambda_expressions;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		Figura fg1 = new Figura() {
			
			@Override
			public void desenha() {
				System.out.println("Desenhando Figura 1");
				
			}
		};
		
		fg1.desenha();
		
		Figura fg2 = ()->System.out.println("Desenha a figura 2");
		fg2.desenha();
	}
	
	

}
