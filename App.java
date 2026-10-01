public class App {
    public static void main(String[] args) throws Exception {
        final double DESC_GENERAL = 0.15;
        final double DESC_ADICIONAL = 0.05;

        double precioCamisaOriginal = 25.0;
        double precioPantalonOriginal = 30.0;

        double descCamisa = precioCamisaOriginal * (1 - DESC_GENERAL);
        double descPantalon = precioPantalonOriginal * (1 - DESC_GENERAL);

        double  camisa2Desc = descCamisa * (1 - DESC_ADICIONAL);

        double totalPrimeraCompra = descCamisa + descPantalon;
        double granTotal = totalPrimeraCompra + camisa2Desc;

        System.out.println("precio camiseta original con descuento: " + descCamisa);
        System.out.println("precio pantalon original con descuento: " + descPantalon);
        System.out.println("precio camiseta con descuento adicional: " + camisa2Desc);
        System.out.println("total de la primera compra: " + totalPrimeraCompra);
        System.out.println("gran total: " + granTotal);



    
        
    }
}
