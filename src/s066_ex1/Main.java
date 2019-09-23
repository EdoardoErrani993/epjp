package s066_ex1;


public class Main {
	public static void main(String[] args) {
		Persona[] arraydiPersone = new Persona[4];
		arraydiPersone[0] = new Dipendente("Edoardo", " Errani");
		arraydiPersone[1] = new Consulente("Pablo", " Lenzi");
		arraydiPersone[2] = new Dipendente("Eugenio", " De Pietri");
		arraydiPersone[3] = new Consulente("Francesco", " L'amante");

		for (Persona persona:arraydiPersone) {
			System.out.println(persona.getNome());
			if (persona instanceof Dipendente) {
				Dipendente dipendente = (Dipendente)persona;
				System.out.println(dipendente.getSalario());
			} else if (persona instanceof Consulente){
				Consulente consulente = (Consulente)persona;
				System.out.println(consulente.getGiornata());

		}
		
		}
	}

}
