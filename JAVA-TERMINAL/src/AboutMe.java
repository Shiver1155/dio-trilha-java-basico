
import java.util.Locale;
import java.util.Scanner;



public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite seu nome");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenhoo " + idade + " anos ");
        System.out.println("Minha altura e " + altura + " cm ");
    }
}
