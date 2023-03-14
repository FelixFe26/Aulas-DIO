package AulaClasses;

public class Clases1 {

	public static void main(String[] args) {

		String primeiroNome = "Francisco";
		String segundoNome= "Felix";

		String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
