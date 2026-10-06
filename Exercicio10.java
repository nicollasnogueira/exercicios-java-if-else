// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 10 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        int primeiro = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundo = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        int terceiro = entrada.nextInt();
        if (primeiro == segundo && segundo == terceiro) {
            System.out.println("os números são iguais");
        } else {
            int maior = primeiro;
            if (segundo > maior) {
                maior = segundo;
            }
            if (terceiro > maior) {
                maior = terceiro;
            }
            System.out.println("Maior número: " + maior);
        }

        entrada.close();
    }
}
