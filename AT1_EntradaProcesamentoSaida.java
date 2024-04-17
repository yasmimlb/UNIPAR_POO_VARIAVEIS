import java.util.Scanner;

class SomaInteiro {
    public static void main(String[] args) {

//Caso seja numeros inteiros, professor nao diz
     
      int prVa = 0;
      int seVa = 0;
      int teVa = 0;
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Informe o primeiro valor");
     prVa = scanner.nextInt();
     
    System.out.println("Informe o segundo valor");
    seVa = scanner.nextInt();
    
    System.out.println("Informe o terceiro valor");
    teVa = scanner.nextInt();

    int total = prVa + seVa + teVa;
    
    System.out.println("O total e :" + total);
    }
}


import java.util.Scanner;

public class SomaDecimal {
    public static void main(String[] args) {
        //Caso seja numeros decimais, professor nao diz

        double prVa = 0.0;
        double seVa = 0.0;
        double teVa = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        prVa = scanner.nextDouble();

        System.out.println("Informe o segundo valor:");
        seVa = scanner.nextDouble();

        System.out.println("Informe o terceiro valor:");
        teVa = scanner.nextDouble();

        double total = prVa + seVa+ teVa;

        System.out.println("O total é: " + total);
    }
}



