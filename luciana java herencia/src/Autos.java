public class Autos extends Vehiculos{
    private int puertas;
    private int redado;
    private String tipoDeMontor;
    private String techo;
    private boolean hibrido;
    private String radio;

    public Autos(String marca, String color, String moddelo, String vidrio, double precio,  String matricula, String espejos, int puertas, int redado, String tipoDeMontor, String techo, boolean hibrido, String radio) {
        super(marca, color, moddelo, vidrio, precio,  matricula, espejos);
        this.puertas = puertas;
        this.redado = redado;
        this.tipoDeMontor = tipoDeMontor;
        this.techo = techo;
        this.hibrido = hibrido;
        this.radio = radio;
    }
}
