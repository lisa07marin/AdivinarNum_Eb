package Inicio;

import Resources.*;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicaOrdenador logicaOrdenador = new LogicaOrdenador();
        logicaOrdenador.logicaGeneral();
        //adivinarPC(scanner);
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

    /*public static void adivinarPC(Scanner scanner) {
        LogicaAdivinadorOrdenador logicaAdivinadorOrdenador = new LogicaAdivinadorOrdenador();
        logicaAdivinadorOrdenador.darPrimerNumero();
        System.out.println(NumeroAleatorio.numString(logicaAdivinadorOrdenador.arrayConNumerosAdivinados.get(0)));
        int coincidentes= Vista.ingresaUsuario(scanner);
        if (coincidentes == 4) {
            logicaAdivinadorOrdenador.coincidentes4();
        }
        if (coincidentes == 3) {
            //logicaAdivinadorOrdenador.coincidentes3();
        }
        if (coincidentes == 2) {

        }
        if (coincidentes == 1) {
            logicaAdivinadorOrdenador.darSegundoNumero();
            System.out.println(NumeroAleatorio.numString(logicaAdivinadorOrdenador.arrayConNumerosAdivinados.get(logicaAdivinadorOrdenador.arrayConNumerosAdivinados.size()-1)));
            coincidentes=Vista.ingresaUsuario(scanner);
            if (coincidentes==1){
                logicaAdivinadorOrdenador.segundoNumeroCoincidente1();
                logicaAdivinadorOrdenador.restoSonLasDosCifraProbables();
            }
            if (coincidentes==2){
                logicaAdivinadorOrdenador.segundoNumeroCoincidente2();
            }
            if (coincidentes==3){
               logicaAdivinadorOrdenador.segundoNumeroCoincidente3();
            }
        }
        if (coincidentes == 0) {
            //logicaAdivinadorOrdenador.darSegundoNumero();
        }
        }*/
}
