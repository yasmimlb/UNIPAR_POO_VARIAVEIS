import java.util.Scanner;

public class VerificacaoIdade {

        public static void main(String[] args) {
            java.util.Scanner POO = new java.util.Scanner(System.in);

            System.out.println("Digite sua idade: ");

            int idade = POO.nextInt();


            if (idade >= 18) {

                System.out.println("Você é maior de idade:");
            }else{
                System.out.println("Você é menor de idade:");
            }
        }

    }
