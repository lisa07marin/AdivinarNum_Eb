package Inicio;

import Resources.*;

public class Inicio {
    public static void main(String[] args) {
        Vista vista = new Vista();
        adivinadorHumanoPensadorPC(vista);
        adivinadorPCPensadorHumano(vista);
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
