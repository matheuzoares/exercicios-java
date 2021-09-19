import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.println("Digite a nota.");
        nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
