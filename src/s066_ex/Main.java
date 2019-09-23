package s066_ex;

public class Main {
	public static void main(String[] args) {
		Veicolo[] veicoli = new Veicolo[3];
		veicoli[0] = new Auto();
		veicoli[1] = new Bus();
		veicoli[2] = new Moto();	
	
	
	for (Veicolo veicolo : veicoli) {
		 System.out.println(veicolo.sterzo());
		 //System.out.println(veicolo.sterzo());
			if (veicolo instanceof Moto) {
				Moto moto = (Moto)veicolo;
				System.out.println(moto.piegare(20));
			} else {
				veicolo.sterzo();			}

	}
	
		

	 

		
	
	
	Climatizza[] clima = new Climatizza[2];
	clima[0] = new Auto();
	clima[1] = new Bus();
	
	for (Climatizza climatiz : clima) {
		 System.out.println(climatiz.climatizza());
		// if (clima[] )
	}
		//(1) steer the car in conditoning 
	for (Climatizza climatiz : clima) {
		if (climatiz instanceof Auto) {
			System.out.println("Questa è una macchina");
			Auto auto = (Auto)climatiz;
			auto.climatizza();
		
		} else {
			System.out.println("Questa non è una macchina");
		}
	}
	
	}
}
