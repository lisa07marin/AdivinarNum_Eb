package Resources;

import java.util.Scanner;

public class LogicaAdivinadorOrdenador extends AdivinadorOrdenador {

    Scanner scanner = new Scanner(System.in);

    public void segundoNumeroCoincidente3CambieUltimaCifraYCoincidenteDisminuyo1() {
        //descartamos primera cifra del primer numero
        //vuelvo al numero anterior en la posicion 3 del vectorNumCoincidentes
        vectorNumCoincidentes[3] = arrayConNumerosAdivinados.get(1)[3]; //coincidentes=3
        //cambio la cifra en posicion 2 del vectorNumCoincidentes por la segunda cifra del primer numero ingresado
        vectorNumCoincidentes[2] = arrayConNumerosAdivinados.get(0)[1];
        arrayConNumerosAdivinados.add(vectorNumCoincidentes);//para mostrar al usuario
        /////////////////////////////////////////////////////////////
        ///usuario ingresa coincidentes/
        //////////////////////////////////////////////////////////////
        if (COINCIDENTES == 3) {//si los coincidentes siguen iguales, entonces:
            vectorNumCoincidentes[2] = arrayConNumerosAdivinados.get(0)[2];
            if (COINCIDENTES == 3) {//si los coincidentes siguen iguales, entonces:
                //la ultima cifra que queda por probar es la correcta
                vectorNumCoincidentes[2] = arrayConNumerosAdivinados.get(0)[3];
                coincidentes4();
            }
        }
        if (COINCIDENTES == 2) {//disminuyen los coincidentes entonces el numero en esa posicion era coincidentes
            //descartamos segunda cifra del primer numero
            //volvemos al valor que tenia antes
            vectorNumCoincidentes[2] = arrayConNumerosAdivinados.get(1)[2];
            //cambiamos la cifra en la posicion 1 por la tercer cifra del primer numero ingresado
            vectorNumCoincidentes[1] = arrayConNumerosAdivinados.get(0)[2];
            if (COINCIDENTES == 2) {////disminuyen los coincidentes entonces el numero en esa posicion era coincidentes
                vectorNumCoincidentes[1] = arrayConNumerosAdivinados.get(1)[1];
                //descarto la tercera cifra del primer numero
                //entonces las ultima cifra del primer num es la coincidentes
                vectorNumCoincidentes[0] = arrayConNumerosAdivinados.get(0)[3];
                coincidentes4();
            }

        }
    }

    public void segundoNumeroCoincidente3CambieUltimaCifraYCoincidenteIgual() {
        //descartamos la primera cifra del primer numero
        vectorNumCoincidentes[3] = arrayConNumerosAdivinados.get(0)[1];
        if (COINCIDENTES == 3) {
            vectorNumCoincidentes[3] = arrayConNumerosAdivinados.get(0)[2];
            if (COINCIDENTES == 3) {
                //entonces las ultima cifra del primer numero es la cifra coincidente
                vectorNumCoincidentes[3] = arrayConNumerosAdivinados.get(0)[3];
                coincidentes4();
            }
        }
    }


    public void segundoNumeroCoincidente3() {
        //numeros no usados (resto) son descartados
        //usamos el segundo numero como los coincidentes
        segundoNumeroComoCoincidentes();
        //cambiamos ultima cifra por primera cifra del primer numero
        vectorNumCoincidentes[3] = arrayConNumerosAdivinados.get(0)[0];
        arrayConNumerosAdivinados.add(vectorNumCoincidentes);
        /////////////////////////////////////////////////////////////
        ///usuario ingresa coincidentes/
        //////////////////////////////////////////////////////////////
        if (COINCIDENTES == 2) { //disminuyen los coincidentes entonces el numero en esa posicion era coincidentes
            segundoNumeroCoincidente3CambieUltimaCifraYCoincidenteDisminuyo1();
        }
        if (COINCIDENTES == 3) {//si los coincidentes siguen iguales, entonces:
            segundoNumeroCoincidente3CambieUltimaCifraYCoincidenteIgual();
        }
        if (COINCIDENTES == 4) {
            coincidentes4();
        }

    }

    public void segundoNumeroCoincidente2() {
        //usamos el segundo numero
        //buscar el coincidente del primer grupo cambiando la ultima cifra por cada cifra del primer numero
        int indicePrimerNumero = 0;
        int indiceSegundoNumeroAModificar = 3;
        do {
            cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(indiceSegundoNumeroAModificar, INDICE_PRIMER_NUMERO, indicePrimerNumero);
            System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
            COINCIDENTES = Vista.ingresaUsuario(scanner);
            if (COINCIDENTES == 2 && indicePrimerNumero < 4) {
                indicePrimerNumero++;
            } else if (COINCIDENTES == 1) {
                arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size() - 1);
                indicePrimerNumero++;
                indiceSegundoNumeroAModificar--;
            }
            if (COINCIDENTES == 2 && indicePrimerNumero > 3) { //que los numeros coincidentes se ubicaron en el mismo lugar
                arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size() - 1);
                //buscar la cifra que quedó del primer numero
                int cifraCoincidente = 0;
                int indiceCifraCoincidente = 0;
                boolean encotrado = false;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (arrayConNumerosAdivinados.get(0)[i] == arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)[j]) {
                            cifraCoincidente = arrayConNumerosAdivinados.get(0)[i];
                            indiceCifraCoincidente = j;
                            encotrado = true;
                        }
                    }
                }
                if (encotrado) {
                    arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size() - 1);
                    cambiarUnaCifraDelUltimoNumeroPorOtraCifra(indiceCifraCoincidente - 1, cifraCoincidente);
                }
                System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                COINCIDENTES = Vista.ingresaUsuario(scanner);
            }
        } while (COINCIDENTES != 3);
        if (COINCIDENTES == 3) {
            do {
                int indiceNumerosFaltantes = 8;
                indiceSegundoNumeroAModificar--;
                cambiarUnaCifraDelUltimoNumeroPorOtraCifraDeOtroVector(indiceSegundoNumeroAModificar, vector, indiceNumerosFaltantes);
                System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                COINCIDENTES = Vista.ingresaUsuario(scanner);
                if (COINCIDENTES == 3) {
                    arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size() - 1);
                }
            } while (COINCIDENTES == 3 && indiceSegundoNumeroAModificar != 0);
            if (COINCIDENTES == 3 && indiceSegundoNumeroAModificar == 0) {
                int indiceNumerosFaltantes = 9;
                cambiarUnaCifraDelUltimoNumeroPorOtraCifraDeOtroVector(indiceSegundoNumeroAModificar, vector, indiceNumerosFaltantes);
                System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                COINCIDENTES = Vista.ingresaUsuario(scanner);
            }
        }
        if (COINCIDENTES == 4) {
            coincidentes4();
        }


    }

    public void segundoNumeroCoincidente1() {
        //problables son los dos numero no usados en posicion 8,9
        vectorNumCoincidentes[0] = vector[8];
        vectorNumCoincidentes[1] = vector[9];
    }

    public void restoSonLasDosCifraProbables() {
        //1 probable esta en el primer grupo
        //1 probable en el segundo grupo
        vectorNumCoincidentes[2] = arrayConNumerosAdivinados.get(INDICE_PRIMER_NUMERO)[0];
        vectorNumCoincidentes[3] = arrayConNumerosAdivinados.get(INDICE_SEGUNDO_NUMERO)[0];
        arrayConNumerosAdivinados.add(vectorNumCoincidentes);//para mostrar al usuario //index=3
        System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
        int COINCIDENTES = Vista.ingresaUsuario(scanner);
        if (COINCIDENTES == 3) {
            //la cifra probable se encuentra en el primer o segundo numero ingresado, para averiguarlo:
            //cambio la cifra en posicion 3 del ultimo numero adivinado por segunda/tercer/cuarta cifra del segundo numero
            int i = 1; //indice del segundo numero
            do {
                cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(3, INDICE_SEGUNDO_NUMERO, i);
                i++;
                System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                COINCIDENTES = Vista.ingresaUsuario(scanner);
            } while (COINCIDENTES == 3);

            //si las cifras probables disminuye, entonces:
            i = 1; //indice del primer numero
            if (COINCIDENTES == 2) {
                //la cifra probable es la que primera cifra del segundo numero ingresado, vuelvo al numero anterior eliminando ultimo numero ingresado
                int ultimo = arrayConNumerosAdivinados.size() - 1;
                arrayConNumerosAdivinados.remove(ultimo);
                cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(2, INDICE_PRIMER_NUMERO, i);//elimino ultimo numero ingresado y coincidentes=3
                System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                COINCIDENTES = Vista.ingresaUsuario(scanner);
                if (COINCIDENTES == 3) {
                    i++;
                    do {
                        cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(2, INDICE_PRIMER_NUMERO, i);
                        i++;
                        System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                        COINCIDENTES = Vista.ingresaUsuario(scanner);
                    } while (COINCIDENTES == 3);

                }
            }
        }
        if (COINCIDENTES == 2) {
            int i = 1;
            do {
                int[] vectorUltimoNumero = arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1);
                vectorUltimoNumero[2] = arrayConNumerosAdivinados.get(0)[i];
                vectorUltimoNumero[3] = arrayConNumerosAdivinados.get(1)[i];
                arrayConNumerosAdivinados.add(vectorUltimoNumero);
                i++;
                System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                COINCIDENTES = Vista.ingresaUsuario(scanner);
            } while (COINCIDENTES == 2); //i solo llega hasta 3

            if (COINCIDENTES == 3) {
                i = 2; //indice del segundo numero
                do {
                    cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(3, INDICE_SEGUNDO_NUMERO, i);
                    i++;
                    System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                    COINCIDENTES = Vista.ingresaUsuario(scanner);
                } while (COINCIDENTES == 3);
                if (COINCIDENTES == 2) {
                    //la cifra probable es la que primera cifra del segundo numero ingresado, vuelvo al numero anterior eliminando ultimo numero ingresado
                    arrayConNumerosAdivinados.remove(arrayConNumerosAdivinados.size() - 1); //elimino ultimo numero ingresado
                    i = 2;
                    do {
                        cambiarUnaCifraDelUltimoNumeroPorUnaCifraDeOtroNumeroDelArray(2, INDICE_PRIMER_NUMERO, i);
                        i++;
                        System.out.println(NumeroAleatorio.numString(arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1)));
                        COINCIDENTES = Vista.ingresaUsuario(scanner);

                    } while (COINCIDENTES == 3);
                }
            }
        }
        if (COINCIDENTES == 4) {
            coincidentes4(); //vector de numeros probables ya encontrados!!
        }
    }

    public void coincidentes4() {
        arrayConNumerosAdivinados.add(vectorNumCoincidentes);
        System.out.println("4!!!");
    }

    public void segundoNumeroComoCoincidentes() {
        for (int i = 0; i < 4; i++) {
            vectorNumCoincidentes[i] = arrayConNumerosAdivinados.get(1)[i];
        }
    }

    public void cambiarUnaCifraDelUltimoNumeroPorOtraCifra(int posicionACambiar, int cifra) {
        int[] vectorUltimoNumero = arrayConNumerosAdivinados.get(arrayConNumerosAdivinados.size() - 1);
        int[] vectorNumeroModificado = new int[4];
        for (int i = 0; i < 4; i++) {
            vectorNumeroModificado[i] = vectorUltimoNumero[i];
        }
        vectorNumeroModificado[posicionACambiar] = cifra;
        arrayConNumerosAdivinados.add(vectorNumeroModificado);
    }


}
