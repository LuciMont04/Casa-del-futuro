public class MegaPago {
    private String nombre;
    private String apellido;
    private double saldo;
    public MegaPago(String nombre, String apellido, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }
    public void  pagar(double monto){
        if(saldo >0){
            saldo = saldo - monto;
            System.out.println(saldo);
        }
    }
    public void recarga(double monto){
        saldo = saldo + monto;
        System.out.println(saldo);
    }
    public void consutaSaldo(){
        System.out.println("tu saldo es " + saldo);
    }
    public void name(){
        System.out.println(nombre + " " + apellido);
    }

}
