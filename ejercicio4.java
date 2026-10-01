import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numm1, numm2, numm3;

        System.out.print("Ingrese el primer número: ");
        numm1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numm2 = teclado.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        numm3 = teclado.nextDouble();

        if (numm1 > numm2 && numm1 <  numm3) {
            System.out.println("cumple, el numero "+ numm1 + " es mayor que " + numm2 + " y menor que " + numm3+".");
        } else {
            System.out.println("No cumple la condición.");
            
            
        }

    }
}
