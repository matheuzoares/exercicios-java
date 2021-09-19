import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, media;

        System.out.println("Digite a primeira nota:");
        num1 = entrada.nextInt();
        
        System.out.println("Digite a segunda nota:");
        num2 = entrada.nextInt();

        media = (num1 + num2) / 2;

        System.out.println(media);

        entrada.close();
    }
}
