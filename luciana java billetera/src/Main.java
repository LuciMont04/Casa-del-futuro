public class Main {
    public static void main(String[] args) {
     MegaPago paga=   new MegaPago("Luciana", " Montenegro",500.30);
        System.out.println(paga);
        paga.name();
        paga.consutaSaldo();
        paga.pagar(240.89);
        paga.recarga(300.70);
        paga.consutaSaldo();
    }
}