package entidades;

public class Barril extends ObjetoLogistico{
    private double raio;
    

    public Barril(double altura, double raio) {
        super(altura);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaVolume() {
        double pi = Math.PI;
        return this.raio * this.raio*pi*altura;
    }

}
