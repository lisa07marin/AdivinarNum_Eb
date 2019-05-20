package Resources;

public class Validacion {

    public static boolean numeroTieneCuatroCifras(String numero) {
        return numero.length() == 4;
    }
    public static boolean cifraRepetida(String numero){
        boolean igual=false;
        for (int i=0;i<numero.length();i++){
            for (int j=0;j<numero.length();j++){
                if (i!=j&&numero.charAt(i)==numero.charAt(j)){
                    igual=true;
                }
            }
        }
        return igual;
    }
    public static boolean opcionCorrecta(int opcion){
        return opcion==1||opcion==2;
    }
}
