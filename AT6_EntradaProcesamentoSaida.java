import java.util.Scanner;

public class SistemaProduto{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        double percentualDesconto = scanner.nextDouble();

        double desconto = precoProduto * (percentualDesconto / 100);
        double novoPreco = precoProduto - desconto;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
