import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double  VELO_PERMITIDA = 80.0;
        final double MULTA = 15000.0;

        int opcion;

        do { 
            System.out.println("1.registrar vehiculo");
            System.out.println("2.apagar radar");
            opcion = teclado.nextInt();

            if (opcion ==1) {

            System.out.println("ingrese su nombre");
            String nombre = teclado.nextLine();
           
           
           
            System.out.println("ingrese la velocidad medida ");
            double veloMedida = teclado.nextDouble();


            if (veloMedida<= VELO_PERMITIDA) {
                System.out.println("todo en orden buen viaje");

            } else {
                double exceVelocidad = veloMedida * VELO_PERMITIDA;
                double valorMulta = exceVelocidad * MULTA;
                System.out.println("conductor sancionado");
                System.out.println("excedio el limite por"+ exceVelocidad);
                System.out.println("VALOR TOTAL A PAGAR"+ MULTA);

            }
              } else if (opcion == 2) {
                System.out.println("apagando sistema del radar");
               } else {
                System.out.println("opcion invalida");
               }
                
    

           

            
            

            
        }while (opcion !=2);

       

        
    }
}
