package heranca;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Gerente gerente = new Gerente("Daniel", "321.465.001-02", formato.parse("15/07/1889"));
		
		gerente.setDados(3, "Gerente Daniel");
		
		System.out.println(gerente.toString());
		
	}

}
