package POO;

public class Gato extends Animales{

    public Gato(String nombre, String habitat, Integer edadMaxima, Boolean esOviparo) {
        super(nombre, habitat, edadMaxima, esOviparo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
