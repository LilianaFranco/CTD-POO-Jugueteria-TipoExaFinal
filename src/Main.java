import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la juguetería Lilo");

        Juguete juegoDeMesa = new JuegoDeMesa("Life", 50.0, 2, 6);
        Juguete jugueteGenerico = new JugueteGenerico("Spiderman", 40.0, 5);
        Juguete disfraz = new Disfraz("Iron Man", 20.0, "M");
        ArrayList<Comprable> articulos = new ArrayList();
        articulos.add(juegoDeMesa);
        articulos.add(jugueteGenerico);
        articulos.add(jugueteGenerico);
        articulos.add(disfraz);
        ComboComposite comboNavideno = new ComboComposite("navideno", articulos);
        System.out.println(juegoDeMesa);



    }
}