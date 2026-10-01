
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
         final double TASA_INTERES = 0.02;
        Scanner teclado = new Scanner(System.in);
        

        int opcion;

        do {
            System.out.println("1. Simular un crédito");
            System.out.println("2. Salir del programa");
            opcion = teclado.nextInt();

            teclado.nextLine();

            if(opcion ==1) {
                System.out.print("Ingrese su nombre: ");
                String nombre = teclado.nextLine();
                System.out.print("Ingrese el monto de dinero: ");
                double montoDinero = teclado.nextDouble();
                System.out.print("Ingrese la cantidad de meses: ");
                int cantidadMeses = teclado.nextInt();

                double interes = montoDinero * TASA_INTERES * cantidadMeses;
                double totalPagar = montoDinero + interes;
                double pagoMensual = totalPagar / cantidadMeses;

                System.out.println("total interes: " + interes);
                System.out.println("total a pagar: " + totalPagar);
                System.out.println("pago mensual: " + pagoMensual);

                if (pagoMensual > 500000) {
                    System.out.println("El crédito no es viable");
                } else {
                    System.out.println("El crédito es viable");
                
                 else if (opcion == 2) {
                    System.out.println("Saliendo del programa...");
                } else {
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            

            } while (opcion != 2);

            teclado.close();

            


           
        }
        
        

        

        
    }

        }
    
    
    

    

    }
    
    
}