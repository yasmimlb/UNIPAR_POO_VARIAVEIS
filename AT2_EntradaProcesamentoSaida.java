import java.util.Scanner;

class SubtracaoInteiro {
    public static void main(String[] args) {

//Caso seja numeros inteiros, professor nao diz
     
      int prVa = 0;
      int seVa = 0;
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Informe o primeiro valor");
     prVa = scanner.nextInt();
     
    System.out.println("Informe o segundo valor");
    seVa = scanner.nextInt();

    int total = prVa - seVa;
    
    System.out.println("O total e :" + total);
    }
}


import java.util.Scanner;

public class SubtracaoDecimal {
    public static void main(String[] args) {
        //Caso seja numeros decimais, professor nao diz

        double prVa = 0.0;
        double seVa = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        prVa = scanner.nextDouble();

        System.out.println("Informe o segundo valor:");
        seVa = scanner.nextDouble();

        double total = prVa - seVa;

        System.out.println("O total é: " + total);
    }
}
