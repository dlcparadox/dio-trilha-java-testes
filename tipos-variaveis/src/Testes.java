import java.util.Locale;
import java.util.Scanner;

public class Testes {
    
    public static void main(String[] args) {
        
        //RPG da Gata

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Define o locale para o scanner, se necessário 

        System.out.println("Digite o nome do personagem: ");
        String nome = scanner.nextLine(); // Lê o nome do personagem

        System.out.println("Digite a idade do personagem: ");
        int idade = scanner.nextInt(); // Lê a idade do personagem

        System.out.println("Contando idade do seu personagem...");

        for (int i = 1; i <= idade; i++) {
            System.out.println(i); // Imprime a idade do personagem
        }

        System.out.println("Seu personagem se chama " + nome + " e tem " + idade + " anos.");
        System.out.println("Agora chegou o momento de escolher a classe do seu personagem: ");
        System.out.println("1 - Guerreiro\n2 - Mago\n3 - Arqueiro\n4 - Paladino\n5 - Assassino\n6 - Clérigo\n7 - Bárbaro\n8 - Druida\n9 - Necromante\n10 - Bardo");
        System.out.println("Escolha uma classe: ");
        int classe = scanner.nextInt(); // Lê a classe do personagem

        MudarJob(classe); // Chama o método para mudar a classe do personagem

        System.out.println("Seu personagem se chama " + nome + ", tem " + idade + " anos e é um " + MudarJob(classe) + ".");
        System.out.println("Agora vamos fazer uma batalha!");
    }

    static String MudarJob (int classe) {
        String classeNome = ""; // Inicializa a variável para armazenar o nome da classe

        switch (classe) {
            case 1 -> classeNome = "Guerreiro";
            case 2 -> classeNome = "Mago";
            case 3 -> classeNome = "Arqueiro";
            case 4 -> classeNome = "Paladino";
            case 5 -> classeNome = "Assassino";
            case 6 -> classeNome = "Clérigo";
            case 7 -> classeNome = "Bárbaro";
            case 8 -> classeNome = "Druida";
            case 9 -> classeNome = "Necromante";
            case 10 -> classeNome = "Bardo";
            default -> System.out.println("Classe inválida!");
        }
        return classeNome; // Retorna o nome da classe
    }
}
