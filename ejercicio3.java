import java.util.Scanner;
public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double matriculaIncripcion = 45000;

        String nombre;
        double precioMensualidad ;
        int mesesADELANTADOS;

        

    

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese el precio de la mensualidad: ");
        precioMensualidad = teclado.nextDouble();
        System.out.print("cuantos meses desea adelantar: ");
        mesesADELANTADOS = teclado.nextInt();
        
        double subtotal = precioMensualidad * mesesADELANTADOS;
        double total = matriculaIncripcion + subtotal;
        


       
    }
}
