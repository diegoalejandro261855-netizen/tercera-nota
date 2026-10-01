import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        int mayor;

        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextInt();

        if (num1>= num2 && num1>=num3) {
            mayor = num1;
        } else if (num2>=num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.print("el numero mayor es"+mayor);
        

    





       

        
        


        





        
    }
}
