// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 8 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite a senha: ");
        String senha = entrada.next();
        if (senha.equals("R10p5")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }

        entrada.close();
    }
}
