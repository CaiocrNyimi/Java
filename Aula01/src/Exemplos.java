import java.util.Scanner;

public class Exemplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler a media da cp, gs, challenge
        System.out.println("Insira a média da cp:");
        float cp = scanner.nextFloat();
        System.out.println("Insira a nota da gs");
        float gs = scanner.nextFloat();
        System.out.println("Nota do Challenge");
        float challenge = scanner.nextFloat();
        //Calcular a media
        float media = cp * 0.2f + gs * 0.6f + challenge * 0.2f;
        //Exibir a media
        System.out.println("A média final é" + media);
    }

}
