package Resources;

public class LogicaAdivinadorOrdenador extends AdivinadorOrdenador {

    public void darPrimerNumero() {
        arrayConNnumerosAdivinados.add(primerNumero());
    }

    public void primerNumeroprobable1() {
        int[] segundoNum = segundoNumero();
        arrayConNnumerosAdivinados.add(segundoNum);
        if (COINCIDENTES==1){
            segundoNumeroProbable1();
            restoSonLasDosCifraProbables();
        }
    }

    public void segundoNumeroProbable1() {
        //problables son los dos numero no usados en posicion 8,9
        vectorNumCoincidentes[0] = vector[8];
        vectorNumCoincidentes[1] = vector[9];
    }

    public void restoSonLasDosCifraProbables() {
        //1 probable esta en el primer grupo
        //1 probable en el segundo grupo
        vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[0];
        vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[0];
        if (COINCIDENTES == 4) {
            coincidentes4();
            //vector de numeros probables ya encontrados!!
        }
        if (COINCIDENTES == 3) {
            //la cifra probable se encuentra en el primer o segundo numero ingresado, para averiguarlo:
            //cambio la cifra en posicion 3 del vectorNumCoincidentes por segunda cifra del segundo numero
            vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[1];
            //si las cifras probables disminuye, entonces:
            if (COINCIDENTES == 2) {
                //la cifra probable es la que primera cifra del segundo numero ingresado
                vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[0];//y numeros probables serian 3
                //cambio la cifra en posicion 2 del vectorNumCoincidentes por la segunda cifra del primer numero ingresado
                vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[1];
                //y desacarto el num ubicado en posicion 2 (primera cifra del primer numero ingresado) (?)
                arrayNumDescartados.add(arrayConNnumerosAdivinados.get(0)[0]);//(?)
                if (COINCIDENTES == 3) {
                    //cambio la cifra en posicion 2 del vectorNumCoincidentes por la tercer cifra del primer numero ingresado
                    vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[2];
                    //y desacarto el num ubicado en posicion 2 (segunda cifra del primer numero ingresado)
                    arrayNumDescartados.add(arrayConNnumerosAdivinados.get(0)[1]);
                    if (COINCIDENTES == 3) {
                        //la cifra probable es la ultima cifra del primer numero ingresado
                        vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[3];  ////vector de numeros probables ya encontrados!!
                    }
                }
                if (COINCIDENTES == 4) {
                    coincidentes4();
                    //vector de numeros probables ya encontrados!!
                }
            }
            //si las cifras probables sigue igual, entonces:
            if (COINCIDENTES == 3) {
                //la cifra probable es la primera cifra del primer numero ingresado
                //desacarto el num ubicado en posicion 3 (segunda cifra del segundo numero ingresado)
                arrayNumDescartados.add(arrayConNnumerosAdivinados.get(1)[1]);
                //y reeemplazamos por la tercera cifra del segundo numero ingresado
                vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[2];
                if (COINCIDENTES == 3) {
                    //el probable del segundo numero es la ultima cifra de tal numero
                    vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[3]; ////vector de numeros probables ya encontrados!!
                }
            }
        }
        if (COINCIDENTES == 2) {
            //las cifras probables no son la primer cifra de los numeros ingresados y reeemplazamos por los siguientes
            vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[1];
            vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[1];

            if (COINCIDENTES == 3) {
                //hacer lo que indica el COINCIDENTES=3 pero con el nidice +1
            }

            if (COINCIDENTES == 2) {
                //las cigras probables no son la segunda cifra de los numeros ingresados y reeemplazamos por los siguientes
                vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[2];
                vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[2];
                if (COINCIDENTES == 2) {
                    //las cifras probables son las ultimas cifras de los numeros ingresados
                    vectorNumCoincidentes[2] = arrayConNnumerosAdivinados.get(0)[3];
                    vectorNumCoincidentes[3] = arrayConNnumerosAdivinados.get(1)[3];///vector de numeros probables ya encontrados!!
                }
            }

        }
    }

    public void coincidentes4() {
        arrayConNnumerosAdivinados.add(vectorNumCoincidentes);
    }


}
