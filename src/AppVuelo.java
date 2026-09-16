public class AppVuelo {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo();
        System.out.println("Vuelo 1:");
        vuelo1.mostrarInfo();

        Vuelo vuelo2 = new Vuelo("OPP123", "Bogotá", "Medellín");
        System.out.println("\nVuelo 2:");
        vuelo2.mostrarInfo();

        Vuelo vuelo3 = new Vuelo("OPP456", "bogotá", "Cartagena", 50, 150);
        System.out.println("\nVuelo 3:");
        vuelo3.mostrarInfo();

        System.out.println("\nPruebas en Vuelo 3:");
        vuelo3.embarcar(20);
        vuelo3.desembarcar(10);
        
        System.out.println("\nEstado final:");
        vuelo3.mostrarInfo();
    }
}