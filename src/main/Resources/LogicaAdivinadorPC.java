package Resources;

import java.util.ArrayList;

public class LogicaAdivinadorPC extends AdivinadorPC {
    ArrayList<String[]> numerosCandidatos = new ArrayList<>();

    public void logicaBasicaAdivinadorPC() {
        Vista vista = new Vista();
        String numero = darNumeroRandomDeList();
        int bien = 0;
        int regular = 0;
        int indiceList = 0;
        do {
            vista.mostrarMensaje(numero);
            bien = vista.pedirCifrasBien();
            regular = vista.pedirCifrasRegulares();
            String[] datosDelNum = {numero, Integer.toString(bien), Integer.toString(regular)};
            numerosCandidatos.add(datosDelNum);
            boolean segundoCandidato = false;
            int i = 0;
            indiceList=0;
            String siguienteNumero = "";

            boolean encontrado=false;

            while (encontrado==false){
                siguienteNumero = listNumerosPosibles.get(0);

                do{
                    segundoCandidato = esCandidatoConPrimerNumero(siguienteNumero, i);
                    if (segundoCandidato){
                        i++;
                    }else {
                        listNumerosPosibles.remove(siguienteNumero);
                        encontrado=false;
                        indiceList++;
                    }
                } while (segundoCandidato&&i<numerosCandidatos.size());


                if (segundoCandidato&&i==numerosCandidatos.size()){
                    encontrado=true;
                    numero=siguienteNumero;
                    listNumerosPosibles.remove(numero);
                }
            }

        } while (bien < 5);
    }

    public boolean esCandidatoConPrimerNumero(String numeroAComprobar, int indice) {
        String[] datoNum = numerosCandidatos.get(indice);
        String numero = datoNum[0];
        int bien = Integer.parseInt(datoNum[1]);
        int regular = Integer.parseInt(datoNum[2]);
        boolean esCandidato = compararDosNumeros(numeroAComprobar, numero, bien, regular);
        return esCandidato;
    }

    public boolean compararDosNumeros(String numero, String siguienteNumero, int bien, int regular) {
        boolean a = comprobarCifrasBien(numero, siguienteNumero, bien);
        boolean b = comprobarCifrasRegular(numero, siguienteNumero, regular);
        boolean esCandidato = a && b;
        return esCandidato;
    }


}
