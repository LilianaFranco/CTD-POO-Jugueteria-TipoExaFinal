public abstract class Juguete implements Comprable{

    //Atributos
    private String nombre;
    private Double precio;

    //Constructor
    public Juguete(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Métodos
    public Double getPrecio(){
        return this.precio;
    }

    @Override
    public String toString() {
        return "Nombre del juego: " + this.nombre;
    }

}
