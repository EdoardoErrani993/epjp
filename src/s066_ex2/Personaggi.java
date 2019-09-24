package s066_ex2;

public abstract class Personaggi {
	private String nome;
	private String clan;
	private int pv;
	private int pa;
	private int bonus;

	public Personaggi(String Nome, String Clan, int Pv, int Pa, int Bonus) {
		this.nome = Nome;
		this.clan = Clan;
		this.pv = Pv;
		this.pa = Pa;
		this.bonus = Bonus;

	}

	public String stampaPv() {
		return String.valueOf(this.pv);

	}

	public void setPv(int Pv) {
		this.pv = Pv;

	}
	
	public int getBonus() {
		return this.bonus;
	}

}
