//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Imprimir en consola
       System.out.println("Hola soy George");

       //Variables

        //Entero
        int num1;
        int num2;
        int sum;

        num1 = 15;
        num2 = 12;
        sum = num1 + num2;

        System.out.println("La suma de " + num1 + " e " + num2 + " es " + sum);

        //Decimales
        double precio1 = 12.5;
        double precio2 = 10.5;

        double multiplication = precio1 * precio2;
        double divisiom = precio1 / precio2;

        System.out.println("La multiplicacion de " + num1 + " es " + multiplication + " y la division es " + divisiom );


        //Verdadero o falso
        boolean esMayorUno;

        esMayorUno = (num1 > 1);

        System.out.println("El numero mayor es " + esMayorUno);

        /*
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
         */
    }
}