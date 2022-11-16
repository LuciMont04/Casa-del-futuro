import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random Random = new Random();
        int num = Random.nextInt(3)+1;
        while(true){
            Scanner sca = new Scanner(System.in);
            System.out.println("Elige opcion 1 para piedra, 2 para papel, 3  para tijera");
            int csa = sca.nextInt();
            switch(num) {
                case 1:
                    System.out.println("piedra");
                    switch (csa) {
                        case 1:
                            System.out.println("Empate");
                            break;
                        case 2:
                            System.out.println("Gana la cumputadora");
                            break;
                        case 3:
                            System.out.println("Tu ganas");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Papel");
                    switch (csa) {
                        case 1:
                            System.out.println("Empate");
                            break;
                        case 2:
                            System.out.println("Gana la cumputadora");
                            break;
                        case 3:
                            System.out.println("Tu ganas");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Tijera");
                    switch (csa) {
                        case 1:
                            System.out.println("Empate");
                            break;
                        case 2:
                            System.out.println("Gana la cumputadora");
                            break;
                        case 3:
                            System.out.println("Tu ganas");
                            break;
                    }
                    continue;
            }
        }
        /*
        Scanner sca = new Scanner(System.in);
        System.out.println("Elige opcion 1 para piedra, 2 para papel, 3  para tijera");
        int csa = sca.nextInt();
        switch(num) {
            case 1:
                System.out.println("piedra");
                switch (csa) {
                    case 1:
                        System.out.println("Empate");
                        break;
                    case 2:
                        System.out.println("Gana la cumputadora");
                        break;
                    case 3:
                        System.out.println("Tu ganas");
                        break;
                }
                break;
            case 2:
                System.out.println("Papel");
                switch (csa) {
                    case 1:
                        System.out.println("Empate");
                        break;
                    case 2:
                        System.out.println("Gana la cumputadora");
                        break;
                    case 3:
                        System.out.println("Tu ganas");
                        break;
                }
                break;
            case 3:
                System.out.println("Tijera");
                switch (csa) {
                    case 1:
                        System.out.println("Empate");
                        break;
                    case 2:
                        System.out.println("Gana la cumputadora");
                        break;
                    case 3:
                        System.out.println("Tu ganas");
                        break;
                }
                break;*/

    }
}
