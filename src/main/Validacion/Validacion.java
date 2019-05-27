package Validacion;

import java.util.ArrayList;

public class Validacion {

    public static boolean numeroTieneCuatroCifras(String numero) {
        return numero.length() == 4;
    }

    public static boolean cifraRepetida(String numero) {
        boolean igual = false;
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < numero.length(); j++) {
                if (i != j && numero.charAt(i) == numero.charAt(j)) {
                    igual = true;
                }
            }
        }
        return igual;
    }

    public static boolean opcionCorrecta(int opcion) {
        return opcion == 1 || opcion == 2;
    }

    public static boolean bienRegularPosiblesCombinaciones(int bien, int regular) {
        boolean combinacionPosible = false;
        String combinacion = Integer.toString(bien) + Integer.toString(regular);
        ArrayList<String> posiblesCombinaciones = new ArrayList<>();
        posiblesCombinaciones.add("00");
        posiblesCombinaciones.add("01");
        posiblesCombinaciones.add("02");
        posiblesCombinaciones.add("03");
        posiblesCombinaciones.add("04");
        posiblesCombinaciones.add("10");
        posiblesCombinaciones.add("11");
        posiblesCombinaciones.add("12");
        posiblesCombinaciones.add("13");
        posiblesCombinaciones.add("20");
        posiblesCombinaciones.add("21");
        posiblesCombinaciones.add("22");
        posiblesCombinaciones.add("30");
        posiblesCombinaciones.add("40");
        for (int i = 0; i < posiblesCombinaciones.size(); i++) {
            if (posiblesCombinaciones.get(i).equals(combinacion)) {
                combinacionPosible = true;
            }
        }
        return combinacionPosible;
    }
}
