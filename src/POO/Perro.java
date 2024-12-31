package POO;

public class Perro extends Animales{
    String raza;
    String genero;

    public Perro(String nombre, String habitat, Integer edadMaxima, Boolean esOviparo, String raza, String genero) {
        super(nombre, habitat, edadMaxima, esOviparo);
        this.raza = raza;
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edadMaxima=" + edadMaxima +
                ", habitat='" + habitat + '\'' +
                ", esOviparo=" + esOviparo +
                '}';
    }

    public void hacerSonido(){
        System.out.println("El Perro ladra");
        System.out.println("El Perro ladra2");
    }

    public static void main(String[] args) {

        Perro perro1 = new Perro( "Firulais", "Casa", 15, false, "chihuahua", "hembra" );
        perro1.hacerSonido();
    }
}

