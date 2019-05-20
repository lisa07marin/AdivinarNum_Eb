package Inicio;

import Game.*;

public class Inicio {
    public static void main(String[] args) {
        Vista vista = new Vista();
        int opcion=vista.mostrarMenuDeJuegos();
        if (opcion==1){
            adivinadorHumanoPensadorPC(vista);
        }
        if (opcion==2){
            adivinadorPCPensadorHumano(vista);
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
