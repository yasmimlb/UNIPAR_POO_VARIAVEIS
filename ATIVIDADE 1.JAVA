public class VariaveisDiferentes {
    public static void main(String[] args) {
        int Ie = 20;
        double AlT = 1.74;
        boolean EsCh = false;
        char GeN = 'F';
        byte QuantidadeByteS = 100;
        short QuantidadeShorT = 1000;
        long PopulacaO = 1000000L;
        float TemperaturA = 25.5f;

        String NoM = "Yasmim";
        int[] NuM = {1, 2, 3, 4, 5};

        System.out.println("Idade: " + Ie);
        System.out.println("Altura: " + AlT);
        System.out.println("Está chovendo? " + EsCh);
        System.out.println("Gênero: " + GeN);
        System.out.println("Quantidade de bytes: " + QuantidadeByteS);
        System.out.println("Quantidade short: " + QuantidadeShorT);
        System.out.println("População: " + PopulacaO);
        System.out.println("Temperatura: " + TemperaturA);
        System.out.println("Nome: " + NoM);
        System.out.print("Números: ");
        for (int nume : NuM) {
            System.out.print(nume + " ");
        }
        System.out.println();
    }
}
