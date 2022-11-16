public class Camiones extends Vehiculos{
    private String cabina;
    private String tipoDeMotor;
    private int rodado;

    public Camiones(String marca, String color, String moddelo, String vidrio, double precio,  String matricula, String espejos, String cabina, String tipoDeMotor, int rodado) {
        super(marca, color, moddelo, vidrio, precio,  matricula, espejos);
        this.cabina = cabina;
        this.tipoDeMotor = tipoDeMotor;
        this.rodado = rodado;
    }
}
