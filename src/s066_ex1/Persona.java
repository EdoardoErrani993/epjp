package s066_ex1;

public class Persona {
	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome + cognome;

	}

}
