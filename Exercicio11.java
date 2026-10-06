// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 11 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite a idade do nadador: ");
        int idade = entrada.nextInt();
        if (idade < 5) {
            System.out.println("Sem categoria para essa idade");
        } else if (idade <= 7) {
            System.out.println("infantilA");
        } else if (idade <= 10) {
            System.out.println("infantilB");
        } else if (idade <= 13) {
            System.out.println("juvenilA");
        } else if (idade <= 17) {
            System.out.println("juvenilB");
        } else {
            System.out.println("Sênior");
        }

        entrada.close();
    }
}
