package Resources;

public class Validacion {

    public static boolean numeroTieneCuatroCifras(String numero) {
        if (numero.length() == 4) {
            return true;
        } else {
            return false;
        }
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
}
