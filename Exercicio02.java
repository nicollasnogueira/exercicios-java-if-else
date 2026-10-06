// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 2 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        entrada.close();
    }
}
