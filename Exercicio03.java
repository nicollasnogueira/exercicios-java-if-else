// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 3 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        int primeiro = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundo = entrada.nextInt();
        if (primeiro == segundo) {
            System.out.println("Números iguais");
        } else if (primeiro > segundo) {
            System.out.println("Diferença: " + (primeiro - segundo));
        } else {
            System.out.println("Diferença: " + (segundo - primeiro));
        }

        entrada.close();
    }
}
