package Resources;

public class NumeroAleatorio {

    //define en un vector el num aleatorio cifra por cifra, sin que se repita alguna
    private int[] definirNumAleatorio4CifrasSinRepetir() {
        int[] numAleatorioVector = new int[4];
        for (int i = 0; i < numAleatorioVector.length; i++) {
            int cifraAleatoria = numDecimalAleatorio();
            if (!cifraRepetida(numAleatorioVector, cifraAleatoria)) {
                numAleatorioVector[i] = cifraAleatoria;
            } else {
                i--;
            }
        }
        return numAleatorioVector;
    }

    //se verifica si la cifra esta repetida
    public boolean cifraRepetida(int[] AleatorioVector, int numDecimal) {
        boolean cifRepetido = false;
        for (int j = 0; j < AleatorioVector.length; j++) {
            if (AleatorioVector[j] == numDecimal) {
                cifRepetido = true;
            }
        }
        return cifRepetido;
    }

    //numero aleatorio decimal entre 0 y 9 que será una cifra del numero
    public int numDecimalAleatorio() {
        return (int) (Math.random() * 10);
    }

    //se concatena en un String el numero que se guardó en el vector, para tu futura comparación
    public String numAleatorio4CifrasSinRepetirString() {
        int[] numAleatorioVector = definirNumAleatorio4CifrasSinRepetir();
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < numAleatorioVector.length; i++) {
            bld.append(Integer.toString(numAleatorioVector[i]));
        }
        return bld.toString();
    }
}
