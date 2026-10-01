import java.util.Scanner;
public class ejercicio13 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double[] numeros = new double[5];
    double suma = 0;
    double promedio;

    System.out.println("calcular el promedio con arrays");

    for (int i = 0; i < 5; i++) {
        System.out.println("ingrese el numero"+(i+1)+ ": ");
        numeros[i] = teclado.nextDouble();

        
        
    }

    for (int i = 0; i < 5; i++) {
        suma = suma + numeros[i];
        
    }

    promedio = suma / 5;

    System.out.println("suma total de los numeros" + suma);
    System.out.println("el promedio final"+ promedio);


    
}
}
