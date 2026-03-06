package Model;

public class Hamburguer {
    public String ingrediente;
    public String ingrediente2;
    public String ingrediente3;
    public String ingrediente4;


    public Hamburguer(String ingrediente2, String ingrediente, String ingrediente3, String ingrediente4) {
        this.ingrediente2 = ingrediente2;
        this.ingrediente = ingrediente;
        this.ingrediente3 = ingrediente3;
        this.ingrediente4 = ingrediente4;

    }

    public String getHamburgao() {
        return ingrediente + " " + ingrediente2 + " " + ingrediente3 + " " +ingrediente4;
    }
}

