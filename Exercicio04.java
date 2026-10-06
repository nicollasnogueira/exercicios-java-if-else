// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 4 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double primeiro = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double segundo = entrada.nextDouble();
        if (primeiro > segundo) {
            System.out.println(primeiro + " e " + segundo);
        } else {
            System.out.println(segundo + " e " + primeiro);
        }

        entrada.close();
    }
}
