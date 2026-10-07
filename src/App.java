import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Random number = new Random ();
        Scanner input = new Scanner(System.in);
        Contador aciertosContador = new Contador();
        Trainer trainer = new Trainer();

        boolean continueGame = true;

        System.out.println("===================================");
        System.out.println("  ¡Bienvenido a ZetaMathTrainer!");
        System.out.println("===================================");
        System.out.println("¿Que deseas entrenar el dia de hoy?");
        System.out.println("Selecciona una opcion del menu:");
        System.out.println("1. Sumas");
        System.out.println("2. Sustracciones");
        System.out.println("3. Multiplicaciones");
        System.out.println("4. Divisiones");
        System.out.println("5. Salir");

        int option = input.nextInt();

        switch (option) {
            case 1:
                trainer.entrenarSumas();
                break;
            case 2:

                while(continueGame) {

                int x = number.nextInt(90) + 10;
                int y = number.nextInt(90) + 10;

                if (x < y) {
                int temp = x;
                x = y;
                y = temp;
                }

                int subtraction = x - y;

                System.out.println("¿Cuanto es " + x + " - " + y + "?: ");
                int answer = input.nextInt();

                if (answer == -1 ) {
                System.out.println("¡Gracias por jugar!");
                break;
                }
                aciertosContador.ProcesarRespuesta(answer == subtraction);

                if (answer != subtraction) {
                trainer.explicarResta(x, y);
                }
            }
            break;

            case 3:
                trainer.entrenarMultiplicaciones();
                break;
            case 4:
                trainer.entrenarDivisiones();
                break;
            case 5:
                System.out.println("¡Gracias por jugar!");
                continueGame = false;
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
        }

    input.close();

    }
}
