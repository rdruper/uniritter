


public class CifraDeCesar {
	
	public String encripta(String texto, int deslocamento) {
		/*char letra;
		String palavra = "";
		for (i = 1; i<= texto.length(); i++) {
			 letra = texto.charAt(i);
			 //letra = letra + deslocamento;
			 
			 palavra += letra;
		}*/
				
		char encriptado[] = new char[texto.length()];
		int i = 0;	
		
		for (char c : texto.toCharArray()) {			
			if (c != ' ') c = (char)(c + deslocamento);
		 	encriptado[i] = c;
		 	i++;					
		}
		
		return new String(encriptado);
		
	}
	
}
