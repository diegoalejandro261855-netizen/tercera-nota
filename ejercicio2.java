import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre; 
        int edad;
        double estatura;

        

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("Ingrese su estatura: ");
        estatura = teclado.nextDouble();

       
    }
}
