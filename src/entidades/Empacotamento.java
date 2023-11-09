package entidades;

public class Empacotamento {
    private Conteiner conteiner;
    private Barril barril;

    public Empacotamento(Conteiner conteiner, Barril barril) {
        this.conteiner = conteiner;
        this.barril = barril;
    }

    public Conteiner getConteiner() {
        return conteiner;
    }

    public void setConteiner(Conteiner conteiner) {
        this.conteiner = conteiner;
    }

    public Barril getBarril() {
        return barril;
    }

    public void setBarril(Barril barril) {
        this.barril = barril;
    }
    
    public double empacotaCarga(){
        //retorna a quantidade de barris que cabem no conteiner.
        double x = conteiner.barrisAltura(barril) * conteiner.barrisComprimento(barril) * conteiner.barrisLargura(barril);
        return Math.floor(x);
    }

    public double aprovaitamentoCarga(){
        double volumeConteiner = conteiner.calculaVolume();
        double somaVolumeBarris = barril.calculaVolume() * empacotaCarga();
        //calcula o volume
        double percentualAproveitamento = somaVolumeBarris/volumeConteiner;
        return percentualAproveitamento;
    }

    
}
