package entidades;

public abstract class ObjetoLogistico {
    protected double altura;

    public ObjetoLogistico(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public abstract double calculaVolume();
    
}
