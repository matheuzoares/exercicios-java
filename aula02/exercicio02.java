import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        media = (nota1 * 0.4) + (nota2 * 0.6);
        
        if (media >= 6) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

        entrada.close();
    }
}
