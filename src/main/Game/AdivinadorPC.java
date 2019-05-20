package Game;

import Validacion.Validacion;

import java.util.ArrayList;
import java.util.List;

public class AdivinadorPC extends PensadorPC {
    List<String> listNumerosPosibles = new ArrayList<>();

    public AdivinadorPC() {
        llenarListConNumerosPosibles();
    }

    public void llenarListConNumerosPosibles() {
        //llenamos con numeros que empiezan con cero (del 123-999)
        for (int i = 123; i < 1000; i++) {
            //pasar numero a string para poder verificarlo
            String numero = "0" + Integer.toString(i);
            boolean cifraRepetida = Validacion.cifraRepetida(numero);
            if (!cifraRepetida) {
                listNumerosPosibles.add(numero);
            }
        }
        //llenamos array con numeros posibles (1000-9999)
        for (int i = 1000; i < 10000; i++) {
            //pasar numero a string para poder verificarlo
            String numero = Integer.toString(i);
            boolean cifraRepetida = Validacion.cifraRepetida(numero);
            if (!cifraRepetida) {
                listNumerosPosibles.add(numero);
            }
        }
    }

    public String darPrimerNumeroRandomDeList() {
        int indice = (int) (Math.random() * 5040);
        String numero = listNumerosPosibles.get(indice);
        return numero;
    }


    public boolean comprobarCifrasBien(String numero, String numero1, int cantidadBien) {
        int cantCifrasBien = cantidadCifrasBien(numero, numero1);
        return cantCifrasBien == cantidadBien;
    }

    public boolean comprobarCifrasRegular(String numero, String numero1, int cantidadRegular) {
        int cantCifrasRegular = cantidadCifrasRegulares(numero, numero1);
        return cantCifrasRegular == cantidadRegular;
    }
}
