public class ControleEstoque {
    public static void main(String[] args) {

        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;
        String marcaProduto;

        nomeProduto = "Fone de Ouvido";
        precoProduto = 29.99;
        quantidadeProduto = 10;
        marcaProduto = "marcaProduto";

        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Marca: " + marcaProduto);
        System.out.println("Preço: $" + precoProduto);
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
    }
}
