public class Main {
    public static void main(String[] args) {
        int entero; // numeros enteros
        char caracter; //caracter "A"
        String cadena; // conjunto de caracter
        Boolean TF;
        double aSD; //CANTIDAD DE NUEMEROS LUEGO DE LA COMA}
        int nombre[] = new int[4];
        nombre[0] = 2;
        nombre[1] = 7;
        nombre[2] = 6;
        nombre[3] = 4;
        for (int i = 0; i >= nombre.length; i++) {
            System.out.print(nombre[i]);

        }
        String HOLA = "";

        switch (HOLA) {
            case "hOLA":
                System.out.println("Es numero");
                break;
            case "CHAU":
                System.out.println("Nos vimos");
                break;
            case "HOLa":
                System.out.println("Falta la A mayuscula ");
                break;
            case "HOLA":
                System.out.println("Hola mundo");
                break;
            default:
                System.out.println("sos cualquiera que te llamas gabi?");
            break;
        }
        int arreglo[] = new int[10];
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;
        arreglo[3] = 4;
        arreglo[4] = 5;
        arreglo[5] = 6;
        arreglo[6] = 7;
        arreglo[7] = 8;
        arreglo[8] = 9;
        arreglo[9] = 10;
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println(arreglo[j]);
        };

        String arreglo1[] = new String[10];
        arreglo1[0] = "hola";
        arreglo1[1] = "mundo";
        arreglo1[2] = "casa";
        arreglo1[3] = "del";
        arreglo1[4] = "futuro";
        arreglo1[5] = "avion";
        arreglo1[6] = "camion";
        arreglo1[7] = "auto";
        arreglo1[8] = "bici";
        arreglo1[9] = "foca";
        for (int y = 0; y < arreglo1.length; y++) {
            System.out.println(arreglo1[y]);
        };

    }
}