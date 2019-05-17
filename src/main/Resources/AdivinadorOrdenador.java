package Resources;

import java.util.ArrayList;

public class AdivinadorOrdenador {
    int[] vector = {2, 3, 8, 1, 0, 4, 6, 7, 9, 5};  ///ARREGLAR PARA QUE LUEGO SEAN NUMEROS ALEATORIOS
    public ArrayList<int[]> arrayConNumerosAdivinados = new ArrayList<>();
    int[] vectorNumCoincidentes = new int[4];  //VECTOR USADO PARA LAS PRIMERAS MODIFICACIONES

    final int INDICE_PRIMER_NUMERO = 0;
    final int INDICE_SEGUNDO_NUMERO = 1;

    int COINCIDENTES = 0;

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

    public int[] vectorNumeroRestantes() {
        int[] vectorNumRestantes = new int[6];
        int i = 0; //indice del segundo numero
        int j = 4; //indice del vector
        do {
            vectorNumRestantes[i] = this.vector[j];
            i++;
            j++;
        } while (i < 6 && j < 10);
        return vectorNumRestantes;
    }

    public void darPrimerNumero() {
        arrayConNumerosAdivinados.add(primerNumero());
    }

    public void darSegundoNumero() { arrayConNumerosAdivinados.add(segundoNumero()); }

    public void cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(int posicionACambiar, int indiceDelArray, int indiceDelNumero) {
        //como java toma los valores referenciados: tomo el vector del array en otro vector
        //instancio un nuevo vector, le asigno valores del vector (anteriormente dicho)
        //modifico un valor del nuevo vector y lo añado al array
        int[] vectorUltimoNumero = arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1);
        int[] vectorNumeroModificado = new int[4];
        for (int i = 0; i < 4; i++) {
            vectorNumeroModificado[i] = vectorUltimoNumero[i];
        }
        vectorNumeroModificado[posicionACambiar] = arrayConNumerosAdivinados.get(indiceDelArray)[indiceDelNumero];
        arrayConNumerosAdivinados.add(vectorNumeroModificado);
    }

    public void cambiarUnaCifraDelUltimoNumeroPorOtraCifraDeOtroVector(int posicionACambiar, int[] vector, int indiceVector) {
        int[] vectorUltimoNumero = arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1);
        int[] vectorNumeroModificado = new int[4];
        for (int i = 0; i < 4; i++) {
            vectorNumeroModificado[i] = vectorUltimoNumero[i];
        }
        vectorNumeroModificado[posicionACambiar] = vector[indiceVector];
        arrayConNumerosAdivinados.add(vectorNumeroModificado);
    }
    public void cambiarUnaCifraDelPrimerNumeroPorOtraCifraDeOtroVector(int posicionACambiar, int[] vector, int indiceVector) {
        int[] vectorUltimoNumero = arrayConNumerosAdivinados.get(0);
        int[] vectorNumeroModificado = new int[4];
        for (int i = 0; i < 4; i++) {
            vectorNumeroModificado[i] = vectorUltimoNumero[i];
        }
        vectorNumeroModificado[posicionACambiar] = vector[indiceVector];
        arrayConNumerosAdivinados.add(vectorNumeroModificado);
    }
}
