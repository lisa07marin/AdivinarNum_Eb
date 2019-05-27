package Game;

import Inicio.Vista;

import java.util.ArrayList;

public class LogicaJuegoAdivinadorPC extends AdivinadorPC {
    private ArrayList<String[]> listNumerosCandidatos = new ArrayList<>(); //lista de vectores,en donde se guardaran los numeros que coinciden en bien y regular

    public void logicaBasicaAdivinadorPC(Vista vista) {
        String numeroCandidato = darPrimerNumeroRandomDeList();
        int bien = 0;
        int regular = 0;
        do {
            vista.mostrarMensaje(numeroCandidato);
            bien = vista.pedirAlUsuarioCantidadDeCifrasBien();
            regular = vista.pedirAlUsuarioCantidadDeCifrasRegulares();
            guardarNumeroEnArrayNumerosCandidatos(numeroCandidato, bien, regular);

            String siguienteNumeroCandidato = "";
            boolean numCandidatoEncontrado = false;

            if (bien == 4) {
                numCandidatoEncontrado = true;
                vista.mostrarMensaje("HE ADIVINADO TU NUMERO!");
            }
            while (!numCandidatoEncontrado&&listNumerosPosibles.size()!=0){
                siguienteNumeroCandidato = listNumerosPosibles.get(0);
                numCandidatoEncontrado=esCandidatoConRespectoAlRestoDeNumerosCandidatos(siguienteNumeroCandidato);
                if (numCandidatoEncontrado) {
                    numeroCandidato = siguienteNumeroCandidato;
                    listNumerosPosibles.remove(numeroCandidato);
                }else {
                    listNumerosPosibles.remove(siguienteNumeroCandidato);
                }
            }
            if(listNumerosPosibles.isEmpty()){
                bien=4; //se le asigna este valor para que salga del bucle
                vista.mostrarMensaje("NO HAY NINGUN NUMERO QUE COINCIDE, HAY ALGUN DATO QUE HAS INGRESADO MAL :|");
            }
        } while (bien < 4);
    }

    public void guardarNumeroEnArrayNumerosCandidatos(String numero, int bien, int regular) {
        String[] datosDelNum = {numero, Integer.toString(bien), Integer.toString(regular)};
        this.listNumerosCandidatos.add(datosDelNum);
    }

    public boolean esCandidatoConRespectoAlRestoDeNumerosCandidatos(String numeroAComprobar) {
        int indArrayNumerosCandidatos=0;
        boolean esCandidato=false;
        do {
            String[] datoNum = this.listNumerosCandidatos.get(indArrayNumerosCandidatos);
            String numero = datoNum[0];
            int bien = Integer.parseInt(datoNum[1]);
            int regular = Integer.parseInt(datoNum[2]);
            esCandidato = compararDosNumeros(numeroAComprobar, numero, bien, regular);
            indArrayNumerosCandidatos++;
        } while (esCandidato&&indArrayNumerosCandidatos < this.listNumerosCandidatos.size());

        return esCandidato;
    }

    public boolean compararDosNumeros(String numero, String siguienteNumero, int bien, int regular) {
        boolean mismaCantidadBien = comprobarCifrasBien(numero, siguienteNumero, bien);
        boolean mismaCantidadRegular = comprobarCifrasRegular(numero, siguienteNumero, regular);
        boolean esCandidato = mismaCantidadBien && mismaCantidadRegular;
        return esCandidato;
    }


}
