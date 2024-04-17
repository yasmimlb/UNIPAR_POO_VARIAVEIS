public class VerificacaoParImpar {
    public static void main(String[] args) {
        Scanner POO = new Scanner(System.in);
        System.out.println("insira um número inteiro:");
        int numero = POO.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!!!");
        } else {
            System.out.println("O número é ímpar!!!");
        }
    }
}

