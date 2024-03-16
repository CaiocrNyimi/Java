import br.com.fiap.tds.model.Carro;

public class Main {
    public static void main(String[] args) {
        // Instanciar um Carro
        Carro newFusca = new Carro();
        newFusca.setCor("Branco");
        newFusca.setModelo("Fusca 2.0 R-Line TSI");
        newFusca.setPlaca("CAI-0777");
        
        //Exibir os valores do modelo, placa e cor
        System.out.println(newFusca.getModelo() + " " + newFusca.getCor() + " " + newFusca.getPlaca());

    }
}
