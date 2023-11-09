package entidades;

public class Conteiner extends ObjetoLogistico {
    private double comprimento;
    private double largura;

    public Conteiner(double altura, double comprimento, double largura) {
        super(altura);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calculaVolume() {
        return altura*largura*comprimento;
    }
    
    //como que faz para ele arredondar para baixo?
    public double barrisComprimento(Barril barril){
        double x =  comprimento/(barril.getRaio()*2);
        Math.floor(x);
        return Math.floor(x);
    }

    public double barrisLargura(Barril barril){
        double x = largura/(barril.getRaio()*2);
        return Math.floor(x);
    }
    public double barrisAltura(Barril barril){
        double x = this.altura/(barril.getAltura());
        return Math.floor(x);
    }
    

}
