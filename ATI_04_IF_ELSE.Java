public class ATI04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o 1º número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o 2º número inteiro:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else (numero2 > numero1) {
            System.out.println("O segundo número é maior.");
        } 
}
}
