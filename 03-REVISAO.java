import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        int opcao;
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Atualizar preço ou quantidade de um produto");
            System.out.println("3. Exibir detalhes de um produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarNovoProduto(scanner, produtos);
                    break;
                case 2:
                    atualizarProdutoExistente(scanner, produtos);
                    break;
                case 3:
                    exibirDetalhesProduto(scanner, produtos);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void adicionarNovoProduto(Scanner scanner, List<Produto> produtos) {
        System.out.print("Digite o nome do produto: ");
        String nomeNovoProduto = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double precoNovoProduto = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidadeNovoProduto = scanner.nextInt();

        Produto novoProduto = new Produto(nomeNovoProduto, precoNovoProduto, quantidadeNovoProduto);
        produtos.add(novoProduto);
        System.out.println("Novo produto adicionado ao estoque com sucesso!");
    }

    private static void atualizarProdutoExistente(Scanner scanner, List<Produto> produtos) {
        System.out.print("Digite o índice do produto que deseja atualizar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < produtos.size()) {
            Produto produto = produtos.get(indice);
            System.out.print("Digite o novo preço do produto: ");
            double novoPreco = scanner.nextDouble();
            System.out.print("Digite a nova quantidade em estoque do produto: ");
            int novaQuantidade = scanner.nextInt();

            produto.setPreco(novoPreco);
            produto.setQuantidadeEmEstoque(novaQuantidade);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void exibirDetalhesProduto(Scanner scanner, List<Produto> produtos) {
        System.out.print("Digite o índice do produto que deseja visualizar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < produtos.size()) {
            Produto produto = produtos.get(indice);
            System.out.println("\nDetalhes do produto:");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
