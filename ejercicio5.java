public class ejercicio5 {
    public static void main(String[] args) {
        int contadorPares = 0;

        for(int i =1; i <= 100; i++) {
            if(i % 2 == 0) {
                contadorPares++;
            }
        } System.out.println("Cantidad de números pares entre 1 y 100: " + contadorPares);
       
    }
}
