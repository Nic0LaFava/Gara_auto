public class DistributoreBenzina {
    private double depositoVerde;
    private double depositoGasolio;
    private double euroPerLitroVerde;
    private double euroPerLitroGasolio;
    
    private double euroTot;
    

    public DistributoreBenzina(double prezzoVerde, double prezzoGasolio) {
        this.euroPerLitroVerde = prezzoVerde;
        this.euroPerLitroGasolio = prezzoGasolio;
        this.depositoVerde = 0;
        this.depositoGasolio = 0;
    }

    public void rifornisciVerde(double litri) {
        depositoVerde += litri;
    }

    public void rifornisciGasolio(double litri) {
        depositoGasolio += litri;
    }

    public void vendi(double euro, Car auto) {
        if (auto.isDiesel()) {
            double litri = euro / euroPerLitroGasolio;
            if (litri <= depositoGasolio) {
                depositoGasolio -= litri;
                auto.addGas(litri);
            }
        } else {
            double litri = euro / euroPerLitroVerde;
            if (litri <= depositoVerde) {
                depositoVerde -= litri;
                auto.addGas(litri);
            }
        }
        
        euroTot += euro;
    }

    public void aggiornaPrezzi(double nuovoPrezzoVerde, double nuovoPrezzoGasolio) {
        euroPerLitroVerde = nuovoPrezzoVerde;
        euroPerLitroGasolio = nuovoPrezzoGasolio;
    }

    public double getEuroTot() {
        return euroTot;
    }
      
}
