package POO;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro( "Firulais", "Casa", 15, false, "chihuahua", "hembra" );
        Gato gato1 = new Gato("Tomito", "Mi casa", 10, false);

        perro1.hacerSonido();
        gato1.hacerSonido();

    }
}
