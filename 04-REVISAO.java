import java.util.Scanner;

class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirCaracteristicas() {
        System.out.println("Qual o raio: " + raio);
        System.out.println("Qual a cor: " + cor);
        System.out.println("Área do Circulo: " + calcularArea());
        System.out.println("Perímetro do Circulo: " + calcularPerimetro());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando um círculo...");
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);

        System.out.println();
        System.out.println("Características do círculo:");
        circulo.exibirCaracteristicas();

        scanner.close();
    }
}
