package s066_ex1;

public class Consulente extends Persona {
	
		
		public Consulente(String nome, String cognome) {
			super(nome, cognome);
		}
			public String getGiornata() {
				return 500 + "euro/giorno";
			}
	}
