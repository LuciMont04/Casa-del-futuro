public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anioLanzamiento;
    private double precio;
    private int stock;
    public Libro(String titulo, String autor, String genero, int anioLanzamiento, float precio,int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        titulo = titulo;
    }

    public void setAutor(String autor) {
        autor = autor;
    }

    public void setGenero(String genero) {
        genero = genero;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public void setPrecio(float precio) {
        precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public boolean comprar(){
        if(stock > 0 ){

            stock -= 1;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", anioLanzamiento=" + anioLanzamiento +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

}
