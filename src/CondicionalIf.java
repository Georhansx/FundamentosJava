public class CondicionalIf {
    public static void main(String[] args) {

        //Condicional
        int num1 = 3;
        int num2= 5;
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
