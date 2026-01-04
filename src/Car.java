public class Car {
    private double resa;        // litri per chilometro
    private double carburante;  // litri nel serbatoio
    private String tipo;        // "verde" oppure "gasolio"

    public Car(double resa, String tipo) {
        this.resa = resa;
        this.carburante = 0;
        this.tipo = tipo;
    }

    public void drive(double km) {
        double consumo = km * resa;
        if (consumo <= carburante) {
            carburante -= consumo;
        } else {
            carburante = 0;
        }
    }

    public double getGas() {
        return carburante;
    }

    public void addGas(double litri) {
        carburante += litri;
    }

    public boolean isDiesel() {
        return tipo.equals("gasolio");
    }
}
