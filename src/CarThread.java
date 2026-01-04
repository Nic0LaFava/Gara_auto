
public class CarThread extends Thread  {
    private Car auto;
    private DistributoreBenzina distributore;
    private String nome;

    public CarThread(String nome, Car auto, DistributoreBenzina distributore) {
        this.nome = nome;
        this.auto = auto;
        this.distributore = distributore;
    }
    
    @Override
    public void run() {
        for (int giro = 1; giro <= 35; giro++) {
            
            double lunghezzaGiro = 1.2;
            
            try {
            if (auto.getGas() < 0.3) {
                System.out.println(nome + " entra ai box (giro " + giro + ")");
                distributore.vendi(20, auto);
                Thread.sleep(500);
            }

            auto.drive(lunghezzaGiro);
            System.out.println(nome + " ha completato il giro " + giro);

            } catch (Exception e) {
                System.out.println("Errore per " + nome);
            }
        }
        
        System.out.println(nome + " HA FINITO!" );
        System.out.println(nome + " Ha speso: " + distributore.getEuroTot());
    }
}
