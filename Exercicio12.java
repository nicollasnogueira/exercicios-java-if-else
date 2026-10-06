// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 12 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();
        double desconto;
        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
        } else {
            // Última faixa da tabela: salário acima de R$ 2.000,00.
            desconto = salario * 0.30;
        }
        System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);

        entrada.close();
    }
}
