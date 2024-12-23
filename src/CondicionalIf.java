import java.util.Scanner;

public class CondicionalIf {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        //Condicional
        System.out.println("Digite um valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um valor: ");
        int num2= 5; sc.nextInt();
        int mult;

        if (num1 > num2){
            mult = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + mult);
        }
        else if (num1 < num2){
            mult = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + mult);
        }
        else {
            mult = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + mult);
        }

    }
}
