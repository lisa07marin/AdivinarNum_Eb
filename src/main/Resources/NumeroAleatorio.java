package Resources;

public class NumeroAleatorio {
    private int[] numAleatorio = new int[4];

    private void definirNumAleatorio4CifrasSinRepetir() {
        this.numAleatorio[0] = numDecimalAleatorioSinCero();
        for (int i = 1; i < 4; i++) {
            if (!cifraRepetida(numDecimalAleatorio())) {
                this.numAleatorio[i] = numDecimalAleatorio();
            }
        }
    }

    public boolean cifraRepetida(int numAleatoio) {
        boolean numRepetido = false;
        for (int j = 0; j < this.numAleatorio.length; j++) {
            if (this.numAleatorio[j] == numAleatoio) {
                numRepetido = true;
            }
        }
        return numRepetido;
    }

    public int numDecimalAleatorio() {
        return (int) (Math.random() * 10);
    }

    public int numDecimalAleatorioSinCero() {
        return (int) (Math.random() * 10 + 1);
    }

    public String numAleatorio4CifrasSinRepetirString() {
        definirNumAleatorio4CifrasSinRepetir();
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < this.numAleatorio.length; ++i) {
            bld.append(Integer.toString(this.numAleatorio[i]));
        }
        return bld.toString();
    }
}
