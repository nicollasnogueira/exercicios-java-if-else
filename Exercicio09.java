// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 9 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o salário bruto: ");
        double salario = entrada.nextDouble();
        System.out.print("Digite o valor da prestação: ");
        double prestacao = entrada.nextDouble();
        if (prestacao <= salario * 0.30) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        entrada.close();
    }
}
