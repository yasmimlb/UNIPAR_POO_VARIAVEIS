//SOBRESCRITA (overriding)

// Classe base Circulo
class Circulo {
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public void mostrar() {
        System.out.println("Círculo com raio: " + raio);
    }
}

// Subclasse CirculoColorido
class CirculoColorido extends Circulo {
    private String cor;

    public CirculoColorido(double raio, String cor) {
        super(raio);
        this.cor = cor;
    }

    // Sobrescrita do método mostrar() para incluir a cor
    @Override
    public void mostrar() {
        System.out.println("Círculo com raio: " + raio + " e cor: " + cor);
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
    }
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);
        c1.mostrar(); // Saída: Círculo com raio: 5.0

        CirculoColorido c2 = new CirculoColorido(3.0, "azul");
        c2.mostrar(); // Saída: Círculo com raio: 3.0 e cor: azul
        c2.mudarCor("vermelho");
        c2.mostrar(); // Saída: Círculo com raio: 3.0 e cor: vermelho
    }
}
