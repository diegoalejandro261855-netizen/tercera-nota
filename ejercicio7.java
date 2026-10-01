import java.util.Scanner; 
public class ejercicio7 {
    
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int numero;
           
              System.out.print("Ingrese un número: ");
              numero = teclado.nextInt();
              System.out.println("Tabla de multiplicar del número " + numero );

              for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;

                System.out.println(numero + " x " + i + " = " + resultado);


                
                

                
            

}


       
    }

}