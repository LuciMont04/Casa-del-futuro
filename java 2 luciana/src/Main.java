import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int num1;
        System.out.println("ingrese un numero entero");
        Scanner consola = new Scanner(System.in);
        num1 = consola.nextInt();
        System.out.println("ingrese otro numero entero");
        int num2 = consola.nextInt();
        if(num)
       */
        String  sf = "hola mundo!";
        String sfupper = "";
        for(int y = 0 ; y < sf.length();y++){
           if(y %2 == 0){
               System.out.println(sf.substring(y , y+1));
               sfupper += sf.substring(y, y+1).toUpperCase();
               System.out.println(sfupper);
           }

        }
    }
}
