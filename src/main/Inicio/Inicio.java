package Inicio;

import Resources.*;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicaAdivinadorPC logicaAdivinadorPC=new LogicaAdivinadorPC();
        logicaAdivinadorPC.logicaBasicaAdivinadorPC();
        //adivinadorHumano(scanner);
    }

    public static void adivinadorHumano(Scanner scanner) {
        Vista vista =new Vista();
        Pensador pensador = new Pensador();
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        String numAleatorio = numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        int cifrasBien = 0;
        int cifrasRegulares = 0;
        do {
            String numAdivinador = vista.pedirNumero();
            cifrasBien = pensador.cantidadCifrasBien(numAdivinador, numAleatorio);
            System.out.println("BIEN: (Cifras en el lugar correcto): " + cifrasBien);
            cifrasRegulares = pensador.cantidadCifrasRegulares(numAdivinador, numAleatorio);
            System.out.println("PROBABLE (Cifras en el lugar incorrecto) : " + cifrasRegulares);
            if (cifrasBien == 4) {
                System.out.println("HAS GANADO!");
            }
        } while (cifrasBien < 4);
    }

}
