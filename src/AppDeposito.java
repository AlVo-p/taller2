public class AppDeposito {
    public static void main(String[] args) {
        DepositoAgua deposito1 = new DepositoAgua(100.0, 80.0);
        DepositoAgua deposito2 = new DepositoAgua(50.0);

        deposito1.setDepositoDesborde(deposito2);

        System.out.println("Estado inicial:");
        deposito1.mostrarInfo();
        deposito2.mostrarInfo();

        System.out.println("\nLlenando 40 litros en el primer depósito...");
        deposito1.llenar(40.0);

        System.out.println("\nEstado final:");
        deposito1.mostrarInfo();
        deposito2.mostrarInfo();
    }
}