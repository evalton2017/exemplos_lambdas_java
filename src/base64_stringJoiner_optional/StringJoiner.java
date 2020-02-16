package base64_stringJoiner_optional;
import java.util.StringTokenizer;

public class StringJoiner {
	
	public static void main(String[] args) {
		String nomes = "Duke,Evalton,Ana,Maria,Kacia";
		
		StringTokenizer st = new StringTokenizer(nomes, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//Classe String joine
		
		System.out.println("StringJoiner");
		
		java.util.StringJoiner sj  = new java.util.StringJoiner(", ");
		
		sj.add("Duke");
		sj.add("Kacia");
		sj.add("Maria");
		sj.add("Ana");
		
		System.out.println(sj);
	}

}
