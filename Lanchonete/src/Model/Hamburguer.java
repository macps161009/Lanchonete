package Model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes;

    double precos;

    public double getPrecos() {
        return precos;
    }

    public void setPrecos(double precos) {
        this.precos = precos;

    }

    public Hamburguer(double precos) {
        this.precos = precos;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Hamburguer(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;


    }

}

