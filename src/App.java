import entidades.Barril;
import entidades.Conteiner;
import entidades.Empacotamento;
import entidades.ObjetoLogistico;

public class App {
    public static void main(String[] args) throws Exception {
        ObjetoLogistico[] vetorObjetoLogisticos = new ObjetoLogistico[4];

        Conteiner conteiner1 = new Conteiner(10, 10, 10);
        Conteiner conteiner2 = new Conteiner(7.0, 17.0, 7.0);
        Barril barril1 = new Barril( 3.22, 3);
        Barril barril2 = new Barril(0.5, 0.25);

        vetorObjetoLogisticos[0] = conteiner1;
        vetorObjetoLogisticos[1] = conteiner2;
        vetorObjetoLogisticos[2] = barril1;
        vetorObjetoLogisticos[3] = barril2;
        System.out.println(barril1.calculaVolume());
        System.out.println(conteiner1.calculaVolume());
        for(int i = 0; i<vetorObjetoLogisticos.length; i++){
            if (vetorObjetoLogisticos[i] instanceof Barril){
                for(int y = 0; y<vetorObjetoLogisticos.length; y++){
                    if(vetorObjetoLogisticos[y] instanceof Conteiner){
                        Conteiner c = (Conteiner) vetorObjetoLogisticos[y];
                        Barril b = (Barril) vetorObjetoLogisticos[i];
                        Empacotamento empacotamento = new Empacotamento(c, b);
                        System.out.println(String.format("%.2f", empacotamento.aprovaitamentoCarga()));  
                    }
                }
            }
        }

        
    }
}
