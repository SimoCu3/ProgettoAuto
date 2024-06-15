/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.

Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi
*/

public class Main {
    public static void main(String[] args) {

        Auto[] automobili = new Auto[5];

        //Prima macchina
        Auto car = new Auto();
        car.setCilindrata(-10);
        car.setTarga("sf123cd");
        car.setMarca("Fiat");
        car.setModello("Punto");

        //prima macchina
        Auto car2 = new Auto();
        car2.setCilindrata(1000);
        car2.setTarga("ab987cs");
        car2.setMarca("mercedes");
        car2.setModello("gt 63 s");


//andiamo a richiamare la classe
        GestioneAuto gestioneAuto = new GestioneAuto();

/*
    //richiamiamo il metodo nella calsse e gli indicatori richiesti
        gestioneAuto.aggiungiAuto(automobili, car);

        //(richiamiamo e)stampiamo il metodo
        gestioneAuto.stampAuto(automobili);
*/
        gestioneAuto.aggiungiAuto(automobili, car);
        gestioneAuto.aggiungiAuto(automobili, car2);

        gestioneAuto.stampAuto(automobili);

    }

}