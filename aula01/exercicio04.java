import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double quilowatt, salario, qtdQuilowatts, pagamento, desconto;

        System.out.println("Digite o salário:");
        salario = entrada.nextDouble();
        
        System.out.println("Digite a quantidade de quilowatts consumida:");
        qtdQuilowatts = entrada.nextDouble();
        
        quilowatt = salario/500;
        pagamento = qtdQuilowatts * quilowatt;
        desconto = pagamento * 0.85;

        System.out.printf(Locale.US, "O valor de cada quilowatt é %.2f", quilowatt);
        System.out.printf(Locale.US, "O valor a ser pago é %.2f", pagamento);
        System.out.printf(Locale.US, "O valor com desconto é %.2f", desconto);

        entrada.close();
    }
}