package Resources;

public class LogicaAdivinadorPC extends AdivinadorPC {




    public void logicaAdivinadorPC(){
        Vista vista=new Vista();
        String primerNumero=darNumeroRandomDeList();
        System.out.println(primerNumero);
        int bien=vista.pedirCifrasBien();
        int regular=vista.pedirCifrasRegulares();
        do{
            String segundoNumero=listNumerosPosibles.get(0);
            //comprobarCifrasBien(primerNumero,segundoNumero,bien);
            //comprobarCifrasRegulares(primerNumero,segundoNumero,regular);
        }while(true);

    }
}
