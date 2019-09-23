package s066_ex1;

public class Dipendente extends Persona {
	//private double salary;
	public Dipendente(String nome, String cognome) {
		super(nome, cognome);
	}
		public String getSalario() {
			return 1200 + "euro/mese";
		}
}
