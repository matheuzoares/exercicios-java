package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha, password;
        
        senha = "R10p5";

        System.out.println("Digite a senha:");
        password = entrada.nextLine();

        if (password.equals(senha)) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }

        entrada.close();
    }
}