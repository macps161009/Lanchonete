

import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientesList = new ArrayList<String>();
        ingredientesList.add("pao");
        ingredientesList.add("ovo");
        ingredientesList.add("pimenta");
        ingredientesList.add("hamburguer");
        ingredientesList.add("bacon");
        ingredientesList.add("banana");

        ArrayList<String> ingredientelist2 = new ArrayList<String>();
        ingredientelist2.add("pao");
        ingredientelist2.add("bacon");
        ingredientelist2.add("ovo");
        ingredientelist2.add("hamburguer");
        ingredientelist2.add("chedar");
        ingredientelist2.add("alface");


        //Hamburguer Xburguer = new Hamburguer(07);
        Hamburguer Xburguer = new Hamburguer(ingredientesList, 10);
        Hamburguer Xbacon = new Hamburguer(ingredientelist2, 15);

        System.out.println( Xbacon.gettudo());
        System.out.println( Xburguer.gettudo());


        Cliente cliente = new Cliente("marcos", "junior");
       //Hamburguer hamburguer = new Hamburguer(ingredientesList);
        Pedido pedido1= new Pedido (cliente, Xbacon);

        //ingredientesList.remove("");
        //System.out.println(ingredientesList);






    }

}