public class Contador {

    private int aciertos = 0;
    private int rachaMax = 0;

    public void ProcesarRespuesta(boolean esCorrecta) {
        
        if (esCorrecta) {
            aciertos++;

                if (aciertos > rachaMax) {
                rachaMax = aciertos;
        }

            System.out.println("Es Correcto! Racha actual: " + aciertos + " puntos. Racha máxima: " + rachaMax + " puntos");
        }

        else {
            System.out.println("Incorrecto, perdiste tu racha. Racha actual: " + aciertos + " puntos. Racha máxima: " + rachaMax + " puntos");
            aciertos = 0;
        }
    }
}