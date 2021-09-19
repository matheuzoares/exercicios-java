import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double salario, aumento;

        System.out.println("Digite o salário:");
        salario = entrada.nextDouble();

        aumento = salario * 1.25;

        System.out.printf(Locale.US, "O aumento é de %.2f", aumento);

        entrada.close();
    }
}
