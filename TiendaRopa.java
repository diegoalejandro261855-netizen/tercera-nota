public class TiendaRopa {
    public static void main(String[] args) throws Exception {
       

        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;


        double descCamiseta1 = precioCamiseta * 0.15;
        double camiseta1conDesc = precioCamiseta - descCamiseta1;

        double desPantalon = precioPantalon * 0.15;
        double pantalonconDesc = precioPantalon - desPantalon;

        double totalPrimeraCompra = camiseta1conDesc + pantalonconDesc;

        

        double descCamiseta2 = camiseta1conDesc * 0.05;
        double camiseta2ConDesc = camiseta1conDesc - descCamiseta2;

        double totalConSegundaCamiseta = totalPrimeraCompra + camiseta2ConDesc;

        System.out.println ("detalle de la compra");
        System.out.printf("camiseta 1 con 15%% desc: $%.2f\n ", camiseta1conDesc);
        System.out.printf("camiseta 1 con 15%% desc: $%.2f\n ", pantalonconDesc);
        System.out.printf("PRECIO TOTAL (1 camiseta + 1 pantalon): $%.2f\n ", totalPrimeraCompra);

        System.out.println("\n PROMOCION SEGUNDA CAMISETA");
        System.out.printf("camiseta 2 con 5%% desc extra: $%.2f\n",camiseta2ConDesc);
        System.out.printf("PRECIO TOTAL FINAL ( 2 camisetas + 1 pantalon):");
        System.out.printf("PRECIO TOTAL FINAL ( 2 camisetas + 1 pantalon):$%.2f\n", totalConSegundaCamiseta);

        



        
    }
}
