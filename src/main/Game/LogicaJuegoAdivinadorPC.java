package Game;

import Inicio.Vista;

import java.util.ArrayList;

public class LogicaJuegoAdivinadorPC extends AdivinadorPC {
    ArrayList<String[]> listNumerosCandidatos = new ArrayList<>(); //lista de vectores,en donde se guardaran los numeros que coinciden en bien y regular

    public void logicaBasicaAdivinadorPC(Vista vista) {
        String numero = darPrimerNumeroRandomDeList();
        int bien = 0;
        int regular = 0;
        do {
            vista.mostrarMensaje(numero);
            bien = vista.pedirAlUsuarioCantidadDeCifrasBien();
            regular = vista.pedirAlUsuarioCantidadDeCifrasRegulares();
            String[] datosDelNum = {numero, Integer.toString(bien), Integer.toString(regular)};
            listNumerosCandidatos.add(datosDelNum);
            boolean numeroCandidato = false;
            String siguienteNumero = "";

            boolean encontrado = false;

            if (bien == 4) {
                encontrado = true;
            }

            while (!encontrado) {
                siguienteNumero = listNumerosPosibles.get(0);
                int indNumerosCandidatos = 0;

                do {
                    numeroCandidato = esCandidatoConRespectoAlRestoDeNumerosCandidatos(siguienteNumero, indNumerosCandidatos);
                    if (numeroCandidato) {
                        indNumerosCandidatos++;
                    } else {
                        listNumerosPosibles.remove(siguienteNumero);
                        encontrado = false;
                    }
                } while (numeroCandidato && indNumerosCandidatos < listNumerosCandidatos.size());

                if (numeroCandidato && indNumerosCandidatos == listNumerosCandidatos.size()) {
                    encontrado = true;
                    numero = siguienteNumero;
                    listNumerosPosibles.remove(numero);
                }
            }

        } while (bien < 4);
    }

    public boolean esCandidatoConRespectoAlRestoDeNumerosCandidatos(String numeroAComprobar, int indice) {
        String[] datoNum = listNumerosCandidatos.get(indice);
        String numero = datoNum[0];
        int bien = Integer.parseInt(datoNum[1]);
        int regular = Integer.parseInt(datoNum[2]);
        boolean esCandidato = compararDosNumeros(numeroAComprobar, numero, bien, regular);
        return esCandidato;
    }

    public boolean compararDosNumeros(String numero, String siguienteNumero, int bien, int regular) {
        boolean mismaCantidadBien = comprobarCifrasBien(numero, siguienteNumero, bien);
        boolean mismaCantidadRegular = comprobarCifrasRegular(numero, siguienteNumero, regular);
        boolean esCandidato = mismaCantidadBien && mismaCantidadRegular;
        return esCandidato;
    }


}
