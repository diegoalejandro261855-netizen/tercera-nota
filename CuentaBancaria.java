public class CuentaBancaria {
    public static void main(String[] args) throws Exception {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasEnMes = 4;

        double totalRetiro = retiroSemanal * semanasEnMes;

        double saldoFinal = saldoInicial - totalRetiro;
        System.out.println("ESTADO DE CUENTA BANCARIA");
        System.out.printf("Saldo inicial:$%.2f\n " , saldoInicial);
        System.out.printf("retiro semanal en el mes:$%.2f\n(por %d semanas)\n " , retiroSemanal, semanasEnMes);
        System.out.printf("Total de retiro en el mes:$%.2f\n " , totalRetiro);
        System.out.printf("Saldo final:$%.2f\n " , saldoFinal);
        


   }     
}
