package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1, num2;

        System.out.println("Digite o primeiro número.");
        num1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo número.");
        num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.printf(Locale.US, "%.2f é maior que %.2f", num1, num2);
        } else {
            System.out.printf(Locale.US, "%.2f é maior que %.2f", num2, num1);
        }
        
        entrada.close();
    }
}
