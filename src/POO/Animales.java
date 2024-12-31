package POO;

public class Animales {
    //Atributos
    String nombre;
    String  habitat;
    Integer edadMaxima;
    Boolean esOviparo;


    public Animales(String nombre, String habitat, Integer edadMaxima, Boolean esOviparo) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.edadMaxima = edadMaxima;
        this.esOviparo = esOviparo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public Boolean getEsOviparo() {
        return esOviparo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public void setEsOviparo(Boolean esOviparo) {
        this.esOviparo = esOviparo;
    }

    @Override
    public String toString() {
        return "Animales{\n" +
                " nombre=" + nombre + ", "+'\n' +
                " habitat=" + habitat + ", "+ '\n' +
                " edadMaxima=" + edadMaxima + ", " + '\n' +
                " esOviparo=" + esOviparo + '\n' +
                '}';
    }


    public void hacerSonido(){
        System.out.println("El animal hace su sonido");
    }
    public static void main(String[] args) {
        //Creando un objeto
        System.out.println("Creando un objeto" );
        var objeto1 = new Animales( "Tigre", "terrestre", 20, false);
        var objeto2 = new Animales( "gato", "de casa", 15, false);
        System.out.println(objeto1.getHabitat());
        System.out.println(objeto1);
        objeto1.setEdadMaxima(32);
        System.out.println(objeto1);
        objeto2.setNombre("perro");
        System.out.println(objeto2);
        objeto2.nombre = "tortuga";
        System.out.println(objeto2);


    }
}
