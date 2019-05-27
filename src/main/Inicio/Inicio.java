package Inicio;

import Game.*;
import Validacion.Validacion;

public class Inicio {
    public static void main(String[] args) {
        Vista vista = new Vista();
        int opcion=vista.mostrarMenuDeJuegos();

        if (Validacion.opcionCorrecta(opcion)){
            if (opcion==1){
                adivinadorHumanoPensadorPC(vista);
            }
            if (opcion==2){
                adivinadorPCPensadorHumano(vista);
            }
        }else{
            vista.mostrarMensaje("No has ingresado una opcion correcta");
        }
    }

    public static void adivinadorHumanoPensadorPC(Vista vista) {
        LogicaJuegoPensadorPC logicaJuegoPensadorPC = new LogicaJuegoPensadorPC();
        logicaJuegoPensadorPC.logicaBasicaPensadorPC(vista);
    }

    public static void adivinadorPCPensadorHumano(Vista vista) {
        LogicaJuegoAdivinadorPC logicaJuegoAdivinadorPC = new LogicaJuegoAdivinadorPC();
        logicaJuegoAdivinadorPC.logicaBasicaAdivinadorPC(vista);
    }

}
