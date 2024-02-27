import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada para receber entrada do usuário.

public class Main { // Define uma classe chamada Main.
    public static void main(String[] args) { // Define o método principal da classe Main.
        double total = 0; // Declara uma variável double chamada total e a inicializa com 0.

        System.out.println("=========================="); // Imprime uma linha de separação.
        System.out.println("==== Caixa supermercado ===="); // Imprime uma mensagem indicando o início do programa.

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner chamado scanner associado à entrada do sistema.

        System.out.print("Insira o valor do primeiro produto: "); // Imprime uma mensagem solicitando ao usuário que insira o valor do primeiro produto.
        total += scanner.nextDouble(); // Lê um valor double digitado pelo usuário e adiciona ao total.

        System.out.print("Insira o valor do segundo produto: "); // Imprime uma mensagem solicitando ao usuário que insira o valor do segundo produto.
        total += scanner.nextDouble(); // Lê um valor double digitado pelo usuário e adiciona ao total.

        System.out.println("O total da compra é: " + total); // Imprime o total da compra.
    }
}