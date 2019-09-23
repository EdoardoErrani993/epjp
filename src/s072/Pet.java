package s072;

public class Pet {
    private String name;

    public Pet(String name) {  //costruttore
        this.name = name;  //assegno il parametro name alla variabile di istanza name
    }

    public String getName() {
        return name;  //metodo per ottenere un nome
    }
}