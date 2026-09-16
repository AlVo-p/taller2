public class libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public libro() {
        disponible = true;
    }
    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    public libro(String titulo, String autor, boolean disponible) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponible = disponible;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    } 
    public void mostrarInfo() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Disponible: " + disponible);
    }
    public void prestar() {
    if (disponible) {
        disponible = false;
        System.out.println("El libro ha sido prestado.");
    } else {
        System.out.println("El libro no está disponible.");
    }
}
    public void devolver() {
    disponible = true;
    System.out.println("El libro ha sido devuelto.");
}
}
