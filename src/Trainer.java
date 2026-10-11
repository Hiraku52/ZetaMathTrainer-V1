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

    public void explicarSuma (int x, int y) {
        
        int decenasY = (y / 10) * 10; 
        int unidadesY = y % 10;        
        int resultadoPaso1 = x + decenasY;
        int resultadoFinal = resultadoPaso1 + unidadesY;

        System.out.println("Truco mental para " + x + " + " + y + ":");
        System.out.println("Paso 1: Suma las decenas (" + decenasY + ") -> " + x + " + " + decenasY + " = " + resultadoPaso1);
        System.out.println("Paso 2: A " + resultadoPaso1 + " súmale las " + unidadesY + " unidades -> " + resultadoPaso1 + " + " + unidadesY + " = " + resultadoFinal);
    }

    public void explicarMultiplicacion (int x, int y) {
        
        int decenasY = (y / 10) * 10; 
        int unidadesY = y % 10;        
        int resultadoPaso1 = x * decenasY;
        int resultadoFinal = resultadoPaso1 + (x * unidadesY);

        System.out.println("Truco mental para " + x + " * " + y + ":");
        System.out.println("Paso 1: Multiplica por las decenas (" + decenasY + ") -> " + x + " * " + decenasY + " = " + resultadoPaso1);
        System.out.println("Paso 2: A " + resultadoPaso1 + " súmale el producto de las unidades (" + unidadesY + ") -> " + resultadoPaso1 + " + (" + x + " * " + unidadesY + ") = " + resultadoFinal);
    }

    public void explicarDivision (int x, int y) {
        
        int decenasY = (y / 10) * 10; 
        int unidadesY = y % 10;        
        int resultadoPaso1 = x / decenasY;
        int resultadoFinal = resultadoPaso1 / unidadesY;

        System.out.println("Truco mental para " + x + " / " + y + ":");
        System.out.println("Paso 1: Divide por las decenas (" + decenasY + ") -> " + x + " / " + decenasY + " = " + resultadoPaso1);
        System.out.println("Paso 2: A " + resultadoPaso1 + " divídelo entre las unidades (" + unidadesY + ") -> " + resultadoPaso1 + " / " + unidadesY + " = " + resultadoFinal);
    }
}
