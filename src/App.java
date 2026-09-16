public class App {
    public static void main(String[] args) throws Exception {
        libro libro1 = new libro();
        libro libro2 = new libro("La metamorfosis", "Franz Kafka");
        libro libro3 = new libro("Nuestra señora de París", "Victor Hugo", false);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
        libro2.prestar();
        libro2.devolver();
    }
}
