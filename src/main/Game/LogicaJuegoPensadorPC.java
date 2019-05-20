package Game;

import Inicio.Vista;
import Validacion.Validacion;

public class LogicaJuegoPensadorPC extends PensadorPC {

    public void logicaBasicaPensadorPC(Vista vista) {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        String numAleatorio = numeroSecreto.numAleatorio4CifrasSinRepetirString();
        int cifrasBien = 0;
        int cifrasRegulares = 0;
        do {
            String numAdivinador = vista.pedirAlUsuarioUnNumero();
            if (Validacion.numeroTieneCuatroCifras(numAdivinador) && !Validacion.cifraRepetida(numAdivinador)) {
                cifrasBien = cantidadCifrasBien(numAdivinador, numAleatorio);
                vista.mostrarMensaje("Bien: " + cifrasBien);
                cifrasRegulares = cantidadCifrasRegulares(numAdivinador, numAleatorio);
                vista.mostrarMensaje("Probable: " + cifrasRegulares);
                if (cifrasBien == 4) {
                    vista.mostrarMensaje("HAS ADIVINADO EL NUMERO! ;)");
                }
            }else{
                vista.mostrarMensaje("Por favor, verifique que el número tenga 4 cifras");
                vista.mostrarMensaje("y que ninguna cifra se repita.");
            }

        } while (cifrasBien < 4);
    }
}
