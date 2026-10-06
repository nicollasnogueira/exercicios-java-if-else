// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 13 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double primeiro = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double segundo = entrada.nextDouble();
        System.out.print("Digite a operação (+, -, * ou /): ");
        char operacao = entrada.next().charAt(0);
        if (operacao == '+') {
            System.out.println("Resultado: " + (primeiro + segundo));
        } else if (operacao == '-') {
            System.out.println("Resultado: " + (primeiro - segundo));
        } else if (operacao == '*') {
            System.out.println("Resultado: " + (primeiro * segundo));
        } else if (operacao == '/') {
            if (segundo > 0) {
                System.out.println("Resultado: " + (primeiro / segundo));
            } else {
                System.out.println("Impossível dividir‼");
            }
        } else {
            System.out.println("Sinal Inválido");
        }

        entrada.close();
    }
}
