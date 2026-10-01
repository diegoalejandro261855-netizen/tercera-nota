import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;

        do {
        
            System.out.println("seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ingrese el primer numero: ");
                    num1 = teclado.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = teclado.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                    case 2:
                    System.out.print("ingrese el primer numero: ");
                    num1 = teclado.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = teclado.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("ingrese el primer numero: ");
                    num1 = teclado.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = teclado.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                    case 4:
                    System.out.print("ingrese el primer numero: ");
                    num1 = teclado.nextDouble();
                    System.out.print("ingrese el segundo numero: ");
                    num2 = teclado.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                    default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;

                    

            
            }

        } while (opcion != 5);

       
        

         

            
            
        



       
        
        
       
    }
}
