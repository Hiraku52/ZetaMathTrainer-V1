public class Trainer {
    
    public void explicarResta (int x, int y) {
        
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int decenasY = (y / 10) * 10; 
        int unidadesY = y % 10;        
        int resultadoPaso1 = x - decenasY;
        int resultadoFinal = resultadoPaso1 - unidadesY;

        System.out.println("Truco mental para " + x + " - " + y + ":");
        System.out.println("Paso 1: Resta las decenas (" + decenasY + ") -> " + x + " - " + decenasY + " = " + resultadoPaso1);
        System.out.println("Paso 2: A " + resultadoPaso1 + " quítale las " + unidadesY + " unidades -> " + resultadoPaso1 + " - " + unidadesY + " = " + resultadoFinal);

    }
}
