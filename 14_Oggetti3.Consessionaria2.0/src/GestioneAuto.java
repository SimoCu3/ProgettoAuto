public class GestioneAuto {

    //metodo dato in input array stampa
    public void stampAuto(Auto[] automobili){
        for(int i = 0; i < automobili.length; i++){
            System.out.println(automobili[i]);
        }
    }

    //metodo per aggiungere auto all'array
    public void aggiungiAuto(Auto[] automobili, Auto car){
        if(automobili[0] == null){
            automobili[0] = car;
        } else {
            for (int i = 1; i < automobili.length; i++) {
                if (automobili[i] == null){
                    automobili[i] = car;
                    break;
                }
            }
        }
    }

}
