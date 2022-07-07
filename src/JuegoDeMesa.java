public class JuegoDeMesa extends Juguete{

    //Atributos
    private int numeroJugMin;
    private int numeroJugMax;

    //Constructor
    public JuegoDeMesa(String nombre, Double precio, int numeroJugMin, int numeroJugMax) {
        super(nombre, precio);
        this.numeroJugMin = numeroJugMin;
        this.numeroJugMax = numeroJugMax;
    }

    @Override
    public Double getPrecio() {
        return getPrecio();
    }
}
