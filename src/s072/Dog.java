package s072;

public class Dog extends Pet {  //Dog sottoclasse di Pet
    private double speed;  //variabile di istanza

    public Dog(String name) {  //costruttore che si prende in input il nome come parametro String name
        this(name, 0);  //stiamo dicendo al costruttore come si chiama il cane
    }

    public Dog(String name, double speed) { //in input ho due parametri che matchano esattamente con gli output delprimo costruttore
        super(name);//chiamo il costruttore della classe pet
        this.speed = speed; //assegna alla variabile di istanza speed il parametro speed che gli abbiamo passato
    }

    public double getSpeed() {  //mi da disponibile la velocità del cane 
        return speed;
    }
}