import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, prestacao, valorMaximo;

        System.out.println("Digite o salário.");
        salario = entrada.nextDouble();
        
        System.out.println("Digite a prestação.");
        prestacao = entrada.nextDouble();

        valorMaximo = salario * 0.3;

        if (prestacao > valorMaximo) {
            System.out.println("O empréstimo não poderá ser concedido.");
        } else {
            System.out.println("O empréstimo será concedido.");
        }
        
        entrada.close();
    }
}