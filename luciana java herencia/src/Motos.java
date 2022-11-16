public class Motos extends Vehiculos {
    private String freno;
    private int cilindrado;
    private int rodado;
    private String tipoDeMotor;

    public Motos(String marca, String color, String moddelo, String vidrio, double precio, String matricula, String espejos, String freno, int cilindrado, int rodado, String tipoDeMotor) {
        super(marca, color, moddelo, vidrio, precio,  matricula, espejos);
        this.freno = freno;
        this.cilindrado = cilindrado;
        this.rodado = rodado;
        this.tipoDeMotor = tipoDeMotor;
    }

}
