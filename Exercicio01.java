// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 1 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("Metade: " + metade);
        }

        entrada.close();
    }
}
