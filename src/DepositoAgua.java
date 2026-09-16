public class DepositoAgua {
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public DepositoAgua() {
        this.capacidad = 0;
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    public DepositoAgua(double capacidad) {
        this.capacidad = capacidad;
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    public DepositoAgua(double capacidad, double volumenActual) {
        this.capacidad = capacidad;
        this.volumenActual = volumenActual;
        this.depositoDesborde = null;
    }

    public void setDepositoDesborde(DepositoAgua deposito) {
        this.depositoDesborde = deposito;
    }

    public void llenar(double cantidad) {
        this.volumenActual += cantidad;
        if (this.volumenActual > this.capacidad) {
            double sobrante = this.volumenActual - this.capacidad;
            this.volumenActual = this.capacidad;
            System.out.println("El depósito principal se ha llenado. Sobrante: " + sobrante + " litros.");
            
            if (this.depositoDesborde != null) {
                System.out.println("Desbordando hacia el segundo depósito...");
                this.depositoDesborde.llenar(sobrante);
            } else {
                System.out.println("Se desperdiciaron " + sobrante + " litros por falta de depósito de desborde.");
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Capacidad: " + this.capacidad + " L | Volumen Actual: " + this.volumenActual + " L");
    }
}