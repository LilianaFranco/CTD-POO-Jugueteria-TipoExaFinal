import java.util.ArrayList;

public class ComboComposite implements Comprable{

    //Atributos
    private String codigo;
    private ArrayList<Comprable> articulos;

    //Constructor


    public ComboComposite(String codigo, ArrayList<Comprable> articulos) {
        this.codigo = codigo;
        this.articulos = articulos;
    }

    @Override
    public Double getPrecio() {
        double total = 0;
        for(Comprable c: articulos){
            total += this.getPrecio();
        }
        return total*1.5;
    }

}
