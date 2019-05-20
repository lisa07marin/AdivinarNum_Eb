package Resources;

import java.util.ArrayList;

public class LogicaAdivinadorPC extends AdivinadorPC {
    ArrayList<String[]> listNumerosCandidatos = new ArrayList<>();

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
            listNumerosCandidatos.add(datosDelNum);
            boolean segundoCandidato = false;
            String siguienteNumero = "";

            boolean encontrado=false;

            if (bien==4){
                encontrado=true;
            }

            while (encontrado==false){
                siguienteNumero = listNumerosPosibles.get(0);
                int i = 0;

                do{
                    segundoCandidato = esCandidatoConPrimerNumero(siguienteNumero, i);
                    if (segundoCandidato){
                        i++;
                    }else {
                        listNumerosPosibles.remove(siguienteNumero);
                        encontrado=false;
                    }
                } while (segundoCandidato&&i< listNumerosCandidatos.size());


                if (segundoCandidato&&i== listNumerosCandidatos.size()){
                    encontrado=true;
                    numero=siguienteNumero;
                    listNumerosPosibles.remove(numero);
                }
            }

        } while (bien < 4);
    }

    public boolean esCandidatoConPrimerNumero(String numeroAComprobar, int indice) {
        String[] datoNum = listNumerosCandidatos.get(indice);
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
