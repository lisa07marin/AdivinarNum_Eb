package Resources;

import java.util.ArrayList;

public class AdivinadorOrdenador {
    int[] vector = {2, 3, 8, 1, 0, 4, 6, 7, 9, 5};
    ArrayList<int[]> arrayConNnumerosAdivinados = new ArrayList<>();
    int []vectorNumCoincidentes=new int[4];
    ArrayList <Integer> arrayNumDescartados=new ArrayList<>();

    int COINCIDENTES =0;


    public int[] primerNumero() {
        int[] primerNumero = new int[4];
        for (int i = 0; i < primerNumero.length; i++) {
            primerNumero[i] = this.vector[i];
        }
        return primerNumero;
    }

    public int[] segundoNumero() {
        int[] segundoNumero = new int[4];
        for (int j = 0; j < segundoNumero.length; j++) {
            for (int i = 4; i < 8; i++) {
                segundoNumero[j] = this.vector[i];
            }
        }
        return segundoNumero;
    }

    public void añadirAlArrayNumUsados(int []numUsado){
        arrayConNnumerosAdivinados.add(numUsado);
    }

}
