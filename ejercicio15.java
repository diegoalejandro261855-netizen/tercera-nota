import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double [] prendas = new double[5];
        double menor;
        int contadorOfertas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el primer numero" + (i+1) + ":");
            prendas[i] = teclado.nextDouble();

            
        }
        menor = prendas [0];

        if (prendas[0] < 30000){

        
             contadorOfertas++;
        }
        
       for (int i = 1; i < 5; i++) {
        if (prendas[i] < menor) {
            menor = prendas[i];
        }

         if (prendas[i]<30000) {
            contadorOfertas++;
             
         }
       }
            
        System.out.println("el precio mas barato"+menor);
        System.out.println("cantidad de prendas en oferta (< $30.000)" + contadorOfertas);

        
    
        
    }
}
