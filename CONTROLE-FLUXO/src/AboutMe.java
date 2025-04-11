import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura (em metros):");
            double altura = scanner.nextDouble();

            System.out.printf("Olá, %s %s. Você tem %d anos e %.2f metros de altura.%n", nome, sobrenome, idade, altura);
        } catch (InputMismatchException e) {
            System.out.println("Os campos de idade e altura precisam ser numéricos.");
        } finally {
            scanner.close();
        }
    }
}
