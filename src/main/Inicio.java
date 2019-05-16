import Resources.NumeroAleatorio;
import Resources.Pensador;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        adivinadorHumano(scanner);
    }

    public static void adivinadorHumano(Scanner scanner) {
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        Pensador pensador = new Pensador();
        String numAleatorio = numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        int cifrasCorrectas = 0;
        do {
            System.out.print("Escriba un numero de 4 cifras: ");
            String numAdivinador = scanner.next();
            cifrasCorrectas = pensador.cifrasEnElLugarCorrecto(numAdivinador, numAleatorio);
            System.out.println("Cifras en el lugar correcto: " + cifrasCorrectas);
            System.out.println("Cifras en el lugar incorrecto: " + pensador.cifrasLugarIncorrecto(numAdivinador, numAleatorio));
            if (cifrasCorrectas == 4) {
                System.out.println("HAS GANADO!");
            }
        } while (cifrasCorrectas < 4);
    }
}
