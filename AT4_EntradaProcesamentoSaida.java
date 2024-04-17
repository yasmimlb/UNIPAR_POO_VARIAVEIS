import java.util.Scanner;

class SomaDivisaoInteiro {
    public static void main(String[] args) {
//Caso seja numeros inteiros, professor nao diz
     
      int prNo = 0;
      int seNo = 0;
      int teNo = 0;
      int quNo = 0;
      
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Informe a primeira nota:");
     prVa = scanner.nextInt();
     
    System.out.println("Informe a segunda nota:");
    seVa = scanner.nextInt();

   System.out.println("Informe a terceira nota:");
    teVa = scanner.nextInt();

    System.out.println("Informe a quarta nota:");
    teVa = scanner.nextInt();
      
    int total = (prNo + seNo + teNo + quNo) / 4 ;
    
    System.out.println("A nota da média é :" + total);
    }
}


import java.util.Scanner;

public class SomaDivisaoDecimal {
    public static void main(String[] args) {
//Caso seja numeros decimais, professor nao diz

        double prNo = 0.0;
        double seNo = 0.0;
        double teNo = 0.0;
        double quNo = 0.0;
      
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Informe a primeira nota:");
        primeiraNota = scanner.nextDouble();
     
        System.out.println("Informe a segunda nota:");
        segundaNota = scanner.nextDouble();
      
        System.out.println("Informe a terceira nota:");
        teVa = scanner.nextInt();

       System.out.println("Informe a quarta nota:");
       teVa = scanner.nextInt();

        double total = (prNo + seNo + teNo + quNo) / 4 ;
    
        System.out.println("A nota da média é :" + total);
    }
}
