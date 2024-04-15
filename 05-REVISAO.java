import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirCaracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção para criar um produto:");
        System.out.println("1. Apenas nome do produto");
        System.out.println("2. Nome e preço do produto");
        System.out.println("3. Nome, preço e quantidade em estoque do produto");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        Produto produto;
        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do produto: ");
                String nomeProduto1 = scanner.nextLine();
                produto = new Produto(nomeProduto1);
                break;
            case 2:
                System.out.print("Digite o nome do produto: ");
                String nomeProduto2 = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double precoProduto2 = scanner.nextDouble();
                produto = new Produto(nomeProduto2, precoProduto2);
                break;
            case 3:
                System.out.print("Digite o nome do produto: ");
                String nomeProduto3 = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double precoProduto3 = scanner.nextDouble();
                System.out.print("Digite a quantidade em estoque do produto: ");
                int quantidadeProduto3 = scanner.nextInt();
                produto = new Produto(nomeProduto3, precoProduto3, quantidadeProduto3);
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.println();
        System.out.println("Produto criado:");
        produto.exibirCaracteristicas();

        scanner.close();
    }
}
