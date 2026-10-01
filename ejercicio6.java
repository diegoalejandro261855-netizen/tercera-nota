import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal;
        int numeroCOPIA;
        long factorial = 1;

        System.out.print("Ingrese un número: ");
        numeroOriginal = teclado.nextInt();
        numeroCOPIA = numeroOriginal;

        while (numeroCOPIA > 0) {
            factorial *= numeroCOPIA;
            numeroCOPIA--;
        }

        System.out.println("El factorial de " + numeroOriginal + " (!" + numeroOriginal + ") es: " + factorial);





    

    }

}
