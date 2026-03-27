package Model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes;

    private double precos;

    public Hamburguer(ArrayList<String> ingredientes, double precos) {
        this.ingredientes = ingredientes;
        this.precos = precos;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecos() {
        return precos;
    }

    public void setPrecos(double precos) {
        this.precos = precos;
    }

    public String gettudo(){
        return precos + " " + ingredientes;
    }


}

