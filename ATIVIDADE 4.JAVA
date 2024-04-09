public class GerenciarEstoque {
    public static void main(String[] args) {
        // Declaração das variáveis para produtos de diferentes categorias
        Produto alimentos;
        Produto bebidas;
        Produto higiene;
        
        // Tem tres tipos de produtos nesta loja entao instanciei os objetos para cada categoria de produto
        alimentos = new Produto();
        bebidas = new Produto();
        higiene = new Produto();
    }
}

class Produto {
    String nomeProduto;
    double precoUnitario;
    int quantidadeEstoque;
}

