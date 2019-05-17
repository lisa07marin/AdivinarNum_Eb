import Resources.*;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicaOrdenador logicaOrdenador=new LogicaOrdenador();
        logicaOrdenador.logicaGeneral();
        //adivinarPC(scanner);
        //adivinadorHumano(scanner);
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
            System.out.println("BIEN: (Cifras en el lugar correcto): " + cifrasCorrectas);
            System.out.println("PROBABLE (Cifras en el lugar incorrecto) : " + pensador.cifrasLugarIncorrecto(numAdivinador, numAleatorio));
            if (cifrasCorrectas == 4) {
                System.out.println("HAS GANADO!");
            }
        } while (cifrasCorrectas < 4);
    }

    public static void adivinarPC(Scanner scanner) {
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
    }
}
