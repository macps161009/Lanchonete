

import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientesList = new ArrayList<String>();
        ingredientesList.add("pao");
        ingredientesList.add("ovo");
        ingredientesList.add("pao");
        ingredientesList.add("hamburguer");
        ingredientesList.add("bacon");


        Cliente cliente = new Cliente("marcos", "junior");
        Hamburguer hamburguer = new Hamburguer(ingredientesList);

        Pedido pedido1 = new Pedido (cliente, hamburguer);

        System.out.println(hamburguer.getIngredientes());


    }

}