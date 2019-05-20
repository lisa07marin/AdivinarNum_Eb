package Resources;

public class LogicaJuegoPensadorPC extends PensadorPC {

    public void logicaBasicaPensadorPC(Vista vista) {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        String numAleatorio = numeroSecreto.numAleatorio4CifrasSinRepetirString();
        int cifrasBien = 0;
        int cifrasRegulares = 0;
        do {
            String numAdivinador = vista.pedirAlUsuarioUnNumero();
            cifrasBien = cantidadCifrasBien(numAdivinador, numAleatorio);
            vista.mostrarMensaje("Bien: " + cifrasBien);
            cifrasRegulares = cantidadCifrasRegulares(numAdivinador, numAleatorio);
            vista.mostrarMensaje("Probable: " + cifrasRegulares);
            if (cifrasBien == 4) {
                vista.mostrarMensaje("HAS ADIVINADO EL NUMERO! ;)");
            }
        } while (cifrasBien < 4);
    }
}
