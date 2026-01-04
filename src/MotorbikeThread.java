
public class MotorbikeThread  extends Thread  {
    private Motorbike moto;
    private DistributoreBenzina distributore;
    private String nome;

    public MotorbikeThread(String nome, Motorbike moto, DistributoreBenzina distributore) {
        this.nome = nome;
        this.moto = moto;
        this.distributore = distributore;
    }
    
    @Override
    public void run() {
        for (int giro = 1; giro <= 35; giro++) {
            
            double lunghezzaGiro = 1.2;
            
            try {
            if (moto.getGas() < 0.3) {
                System.out.println(nome + " entra ai box (giro " + giro + ")");
                distributore.vendi(20, moto);
                Thread.sleep(500);
            }

            moto.drive(lunghezzaGiro);
            System.out.println(nome + " ha completato il giro " + giro);

            } catch (Exception e) {
                System.out.println("Errore per " + nome);
            }
        }
        
        System.out.println(nome + " HA FINITO!");
        System.out.println(nome + " Ha speso: " + distributore.getEuroTot());
    }
}
