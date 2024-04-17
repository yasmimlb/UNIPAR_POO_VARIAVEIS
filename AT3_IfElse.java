import java.util.Scanner;

public class VerificacaoLogin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome de usuário:");
            String nomeUsuario = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String senha = scanner.nextLine();

            if (nomeUsuario.equals("usuario") && senha.equals("senha123")) {
                System.out.println("Login bem-sucedido");
            }
            else {
                System.out.println("Nome de usuário ou senha incorretos");
            }
        }
    }
