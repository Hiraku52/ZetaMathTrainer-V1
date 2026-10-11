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
                while(continueGame) {
                int x = number.nextInt(90) + 10;
                int y = number.nextInt(90) + 10;
                int sum = x + y;
                
                System.out.println("¿Cuanto es " + x + " + " + y + "?: ");

                long startTime = System.currentTimeMillis();
                int answer = input.nextInt();
                long endTime = System.currentTimeMillis();
                double elapsedTime = (endTime - startTime)/1000.0;

                if (answer == -1 ) {
                System.out.println("¡Gracias por jugar!");
                break;
                }

                if (answer == sum) {
                    aciertosContador.ProcesarRespuesta(true);
                    System.out.println("¡Bien hecho! Tardaste " + elapsedTime + " segundos.");
                } else {
                    aciertosContador.ProcesarRespuesta(false);
                    trainer.explicarSuma(x, y);
                    System.out.println("Tardaste " + elapsedTime + " segundos.");
                }
            }
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

                if (answer == subtraction) {
                    aciertosContador.ProcesarRespuesta(true);
                } else {
                    aciertosContador.ProcesarRespuesta(false);
                    trainer.explicarResta(x, y);
                }
            }
            break;

            case 3:
                
                while(continueGame) {
                int x = number.nextInt(90) + 10;
                int y = number.nextInt(8) + 2;
                int multiplication = x * y;

                System.out.println("¿Cuanto es " + x + " * " + y + "?: ");
                int answer = input.nextInt();

                if (answer == -1 ) {
                System.out.println("¡Gracias por jugar!");
                break;
                }

                if (answer == multiplication) {
                    aciertosContador.ProcesarRespuesta(true);
                } else {
                    aciertosContador.ProcesarRespuesta(false);
                    trainer.explicarMultiplicacion(x, y);
                }
            }
                break;
            case 4:
                while(continueGame) {

                int y = number.nextInt(11) + 2;
                int resultadoEsperado = number.nextInt(11) + 2;
                int x = y * resultadoEsperado;

                System.out.println("¿Cuanto es " + x + " / " + y + "?: ");

                long startTime = System.currentTimeMillis();
                int answer = input.nextInt();
                long endTime = System.currentTimeMillis();
                double elapsedTime = (endTime - startTime)/1000.0;

                if (answer == -1 ) {
                System.out.println("¡Gracias por jugar!");
                break;
                }

                if (answer == resultadoEsperado) {
                    aciertosContador.ProcesarRespuesta(true);
                    System.out.println("¡Bien hecho! Tardaste " + elapsedTime + " segundos.");
                } else {
                    aciertosContador.ProcesarRespuesta(false);
                    System.out.println("¡Incorrecto! La respuesta correcta es: " + resultadoEsperado);
                    System.out.println("Tardaste " + elapsedTime + " segundos.");
                    trainer.explicarDivision(x, y);
                }
            }
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
