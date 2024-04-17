public class Algoritmo {
    public static void main(String[] args) {
        Scanner POO = new Scanner(System.in);
        
        System.out.print("Digite o número de anos: ");
        int anos = POO.nextInt();
        
        System.out.print("Digite o número de meses: ");
        int meses = POO.nextInt();
        
        System.out.print("Digite o número de dias: ");
        int dias = POO.nextInt();
        
        int TotalDias = anos * 365 + meses * 30 + dias;
        
        System.out.println("A idade em dias é: " + TotalDias + " dias.");
        
        scanner.close();
    }
}
