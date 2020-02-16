package base64_stringJoiner_optional;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Exemplo64 {
	
	public static void main(String[] args) {
		String texto = "Classe base64 com java 8";
		
		try {
			String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes("utf-8"));
			
			String textoDecodificado = new String (Base64.getDecoder().decode(textoCodificado),"utf-8");
			
			System.out.println("Texto codificado "+textoCodificado +" <----> "+"Texto decodificado "+textoDecodificado);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
