public class Fecha {
    private double dia;
    private double mes;
    private double anio;

    public Fecha(double dia, double mes, double anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public double getDia() {
        return dia;
    }

    public double getMes() {
        return mes;
    }

    public double getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
    }
}
