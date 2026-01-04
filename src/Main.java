
public class Main {
    public static void main(String[] args) {
        
        DistributoreBenzina d = new DistributoreBenzina(1.8, 1.7);  //prezzo verde e giallo
        
        d.rifornisciVerde(500);                                     //aggiunge litri verde
        d.rifornisciGasolio(500);                                   //aggiunge litri gasolio

        Car c1 = new Car(0.05, "verde");                            //crea una macchina inserisce resa, tipo di carburante
        Car c2 = new Car(0.06, "gasolio");
        Car c3 = new Car(0.04, "verde");
        Motorbike m1 = new Motorbike(0.04, "verde");                //crea una moto inserisce resa, tipo di carburante

        CarThread t1 = new CarThread("Francesco", c1, d);             //crea un nuovo thread di macchina inserisce nome, auto, distributore
        CarThread t2 = new CarThread("Milo", c2, d);
        CarThread t3 = new CarThread("LanaDelRey", c3, d);
        MotorbikeThread t4 = new MotorbikeThread("Antonio", m1, d); //crea un nuovo thread di moto inserisce nome, auto, distributore

        t1.start();                                                 
        t2.start();
        t3.start();
        t4.start();
    }
    
}
