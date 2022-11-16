public class Hora {
    private double hora;
    private double minuto;

    public Hora(double hora, double minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public double getHora() {
        return hora;
    }

    public double getMinuto() {
        return minuto;
    }

    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
