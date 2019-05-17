package Resources;

import java.util.ArrayList;

public class AdivinadorOrdenador {
    int[] vector = {2, 3, 8, 1, 0, 4, 6, 7, 9, 5};  ///ARREGLAR PARA QUE LUEGO SEAN NUMEROS ALEATORIOS
    public ArrayList<int[]> arrayConNumerosAdivinados = new ArrayList<>();
    int[] vectorNumCoincidentes = new int[4];  //VECTOR USADO PARA LAS PRIMERAS MODIFICACIONES

    final int INDICE_PRIMER_NUMERO = 0;
    final int INDICE_SEGUNDO_NUMERO = 1;

    int COINCIDENTES=0;

    public ArrayList<int[]> getArrayConNumerosAdivinados() {
        return this.arrayConNumerosAdivinados;
    }

    public int[] primerNumero() {
        int[] primerNumero = new int[4];
        for (int i = 0; i < primerNumero.length; i++) {
            primerNumero[i] = this.vector[i];
        }
        return primerNumero;
    }

    public int[] segundoNumero() {
        int[] segundoNumero = new int[4];
        int i = 0; //indice del segundo numero
        int j = 4; //indice del vector
        do {
            segundoNumero[i] = this.vector[j];
            i++;
            j++;
        } while (i < 4 && j < 8);
        return segundoNumero;
    }

    public void añadirAlArrayNumUsados(int[] numUsado) {
        arrayConNumerosAdivinados.add(numUsado);
    }

    public void darPrimerNumero() {
        arrayConNumerosAdivinados.add(primerNumero());
    }

    public void darSegundoNumero() {
        arrayConNumerosAdivinados.add(segundoNumero());
    }
}
