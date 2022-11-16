public class Vehiculos {
    private String  marca;
    private String color;
    private String moddelo;
    private String vidrio;
    private double precio;

    private String matricula;
    private String espejos;

    public Vehiculos(String marca, String color, String moddelo, String vidrio, double precio,  String matricula, String espejos) {
        this.marca = marca;
        this.color = color;
        this.moddelo = moddelo;
        this.vidrio = vidrio;
        this.precio = precio;

        this.matricula = matricula;
        this.espejos = espejos;
    }
    @Override public String toString(){return"";}
    public void ruidoMotor(){}
    public void cargaCombustible(double carga){}
}
