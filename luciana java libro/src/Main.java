public class Main {
    public static void main(String[] args) {
        Libro orgullo = new Libro("Orgullo y prejuicio","Jane Austen","Novela Romantica y Dramatica",1813,3540,3);
        Libro estrellas = new Libro("Hasta que nos quedemos sin estrellas","Inma Rubiales","Novela de romance y drama",2022,4260,4);
        Libro diciembre = new Libro("Antes de diciembre","Joana Matcús","novela juvenil,drama y romance",2021,4870,3);
        Libro decididas = new Libro("Decididas: Amor, Sexo y Dinero","María Florencia Freijo","frminista, drna y romance",2022,3200,1);
        Libro boulevard = new Libro("Boulevard :La versión de Flor","Flor M. Salvador","Novela juvenil, amor,drama y autoleciones",2020,4874,100);
        System.out.println(orgullo.toString());
        System.out.println(estrellas.toString());
        System.out.println(diciembre.toString());
        System.out.println(boulevard.toString());
        System.out.println(decididas.toString());
        System.out.println(orgullo.comprar());
        System.out.println(orgullo.getTitulo());
        System.out.println(orgullo.getAutor());
        System.out.println(orgullo.getGenero());
        System.out.println(orgullo.getPrecio());
        System.out.println(estrellas.getTitulo());




    }
}
