public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public Vuelo() {
        this.numero = "Sin número";
        this.origen = "Sin origen";
        this.destino = "Sin destino";
        this.ocupacion = 0;
        this.capacidadMaxima = 0;
    }

    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
        this.capacidadMaxima = 0;
    }

    public Vuelo(String numero, String origen, String destino, int ocupacion, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = ocupacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void embarcar(int pasajeros) {
        if (this.ocupacion + pasajeros <= this.capacidadMaxima) {
            this.ocupacion += pasajeros;
        } else {
            System.out.println("No hay capacidad suficiente para embarcar.");
        }
    }

    public void desembarcar(int pasajeros) {
        if (this.ocupacion - pasajeros >= 0) {
            this.ocupacion -= pasajeros;
        } else {
            System.out.println("No se pueden desembarcar más pasajeros de los existentes.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Número: " + this.numero);
        System.out.println("Origen: " + this.origen);
        System.out.println("Destino: " + this.destino);
        System.out.println("Ocupación: " + this.ocupacion);
        System.out.println("Capacidad Máxima: " + this.capacidadMaxima);
    }
}