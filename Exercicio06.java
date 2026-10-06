// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 6 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite a altura em metros: ");
        double altura = entrada.nextDouble();
        System.out.print("Digite o sexo (M ou F): ");
        String sexo = entrada.next();
        if (sexo.equalsIgnoreCase("M")) {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);
        } else if (sexo.equalsIgnoreCase("F")) {
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido");
        }

        entrada.close();
    }
}
