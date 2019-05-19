package Resources;

import java.util.Scanner;

public class LogicaOrdenador extends AdivinadorOrdenador {
    Scanner scanner = new Scanner(System.in);
    int[] vectorNumRestantes = vectorNumeroRestantes();

    public void logicaGeneral() {
        darPrimerNumero();
        int indPrimerNumero = arrayConNumerosAdivinados.get(0).length - 1;
        int intVectorNumRestantes = 0;
        System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
        COINCIDENTES = Vista.ingresaUsuario(scanner);
        int COINCIDENTESAnterior = COINCIDENTES;

        if (COINCIDENTES == 0 || COINCIDENTES == 1 || COINCIDENTES == 2 || COINCIDENTES == 3) {
            cambiarUnaCifraDelPrimerNumeroPorOtraCifraDeOtroVector(indPrimerNumero, vectorNumRestantes, intVectorNumRestantes);
            System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
            COINCIDENTES = Vista.ingresaUsuario(scanner);
        }
        while (COINCIDENTES < 4) {
            if (COINCIDENTES == COINCIDENTESAnterior) {
                intVectorNumRestantes++;
                COINCIDENTESAnterior = COINCIDENTES;
            }
            if (COINCIDENTES == (COINCIDENTESAnterior + 1)) {
                indPrimerNumero--;
                intVectorNumRestantes++;
                COINCIDENTESAnterior = COINCIDENTES;
            }
            if (COINCIDENTES == (COINCIDENTESAnterior - 1)) {
                arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size() - 1);
                indPrimerNumero--;
                intVectorNumRestantes++;
            }
            cambiarUnaCifraDelUltimoNumeroPorOtraCifraDeOtroVector(indPrimerNumero, vectorNumRestantes, intVectorNumRestantes);
            System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
            COINCIDENTES = Vista.ingresaUsuario(scanner);
        }
        if (COINCIDENTES == 4) {
            System.out.println("4!!!!!!!!!!!!!!!!");
        }
    }

    public void indiceNumRestantes5Coincidentes1(){
        //borrar todos los elementos del array
        while(arrayConNumerosAdivinados.size()>1){
            arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size()-1);
        }
        
    }
}
