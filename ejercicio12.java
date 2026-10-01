import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        

        


        do { 
            System.out.println("1.calcular salario con bono");
            System.out.println("2 salir");
            opcion = teclado.nextInt();
            
            if (opcion ==1) {
                System.out.println("ingrese su nombre");
                String nombre = teclado.nextLine();
                System.out.println("ingrese su salario base");
                double salarioBase = teclado.nextDouble();
                System.out.println("ingrese sus años en la empresa");
                int añosEmpresa = teclado.nextInt();

                double porcentajeBono = 0.0;

                

                if (porcentajeBono > 5) {
                   porcentajeBono = 0.20;

                   } else if (porcentajeBono >= 2) {
                    porcentajeBono = 0.10;
                    
                } else  {
                    porcentajeBono = 0.0;
                }

                double valorBono = salarioBase * porcentajeBono;
                double salarioTotalFinal = salarioBase + valorBono;

                System.out.println("EMPLEADO"+ nombre);
                System.out.println("antiguedad"+ añosEmpresa);
                System.out.println("porcentaje bono"+(porcentajeBono * 100)+"%");
                System.out.println("valor bono"+ valorBono);
                System.out.println("salario total a pagar"+ salarioTotalFinal);
                

               
                
            }

            else if(opcion ==2) {
                System.out.println("saliendo del sistema");
                }else{
                    System.out.println("OPCION NO VALIDA");
            }


            
        } while (opcion !=2);

        
    }
}
