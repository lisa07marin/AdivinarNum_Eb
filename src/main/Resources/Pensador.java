package Resources;

public class Pensador {

    public int cifrasCoincidentes(String numAdivinador, String numPensador) {
        int numCifrasCoincidentes = 0;
        for (int i = 0; i < numPensador.length(); i++) {
            for (int j = 0; j < numAdivinador.length(); j++) {
                if (numAdivinador.charAt(i) == numPensador.charAt(j)) {
                    numCifrasCoincidentes++;
                }
            }
        }
        return numCifrasCoincidentes;
    }

    public int cantidadCifrasBien(String numAdivinador, String numPensador) {
        int cifrasLugarCorrecto = 0;
        for (int i = 0; i < numPensador.length(); i++) {
            if (numAdivinador.charAt(i) == numPensador.charAt(i)) {
                cifrasLugarCorrecto++;
            }
        }
        return cifrasLugarCorrecto;
    }

    public int cantidadCifrasRegulares(String numAdivinador, String numPensador) {
        return (cifrasCoincidentes(numAdivinador, numPensador)) - (cantidadCifrasBien(numAdivinador, numPensador));
    }

}
