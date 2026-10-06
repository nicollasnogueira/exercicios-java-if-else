// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 7 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();
        System.out.print("Digite a quantidade de anos na empresa: ");
        int anos = entrada.nextInt();
        double bonus;
        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }
        System.out.printf("Bônus: R$ %.2f%n", bonus);

        entrada.close();
    }
}
