import java.util.Scanner;

public class NuOpeDecimal {
    public static void main(String[] args) {
      //caso seja em double, prof nao diz
      
        double num1, num2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número:");
        num1 = scanner.nextDouble();
        
        System.out.println("Informe o segundo número:");
        num2 = scanner.nextDouble();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println("Multiplicação: " + (num1 * num2));
    }
}


import java.util.Scanner;

public class NuOpeInteiro {
    public static void main(String[] args) {
           //caso seja em int, prof nao diz
      
        int num1, num2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número:");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número:");
        num2 = scanner.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println("Multiplicação: " + (num1 * num2));
    }
}
