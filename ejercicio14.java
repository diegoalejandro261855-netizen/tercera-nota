import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double[] numeros = new double[5];
        double mayor;
       
        System.out.println("buscador de numero mayor en un array");

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el numero" + (i+1)+ ":");
            numeros[i] = teclado.nextDouble();
        
            }

             mayor = numeros[0];

            
             
            for (int i = 1;i < 5; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }

                
                
            }
            
        System.out.println("el nuemro mayor ingresador fue" + mayor);
        
    }
}
