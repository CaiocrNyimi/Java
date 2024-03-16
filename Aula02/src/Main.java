public class Main {
    public static void main(String[] args) {

        //Criar um objeto para representar um cachorro
        Cachorro dogBelga = new Cachorro();

        //Atrubuir valores aos atributos do objeto
        dogBelga.nome = "Spike";
        dogBelga.peso = 30;
        dogBelga.idade = 6;
        dogBelga.castrado = true;

        //Exibir os dados do objeto cachorro
        System.out.println("Cachorro 1\n");
        System.out.println(dogBelga.nome + " tem " + dogBelga.idade + " anos e pesa " + dogBelga.peso + "kg.");
        System.out.println("Ele é castrado? " + dogBelga.castrado);

        //Criar um outro objeto cachorro
        Cachorro dogAlemao = new Cachorro();

        //Atribuir outros valores
        dogAlemao.nome = "Antonio Fagundes";
        dogAlemao.peso = 47;
        dogAlemao.idade = 8;
        dogAlemao.castrado = false;

        //Exibir os valores do outro objeto
        System.out.println("\nCachorro 2\n");
        System.out.println(dogAlemao.nome + " tem " + dogAlemao.idade + " anos e pesa " + dogAlemao.peso + "kg.");
        System.out.println("Ele é castrado? " + dogAlemao.castrado);
        System.out.println("\n");

        //Chamar os métodos
        dogBelga.andar();
        dogAlemao.andar();

        //Chamar os metodos para calcular a dose do remedio
        //1 a cada 7kg
        float doseBelga = dogBelga.calcularDose(5);
        System.out.println("Doses necessarias: " + doseBelga);

        //Calcular e exibir a idade humana do dog
        int idadeDogReal = dogBelga.calcularIdade();
        System.out.println("Idade humana: " + idadeDogReal);


    }
}