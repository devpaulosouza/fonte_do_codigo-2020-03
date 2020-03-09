import java.util.Scanner;

class Fazenda {


    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);


            short totalTestes = scanner.nextShort();

            for (int i = 0; i < totalTestes; ++i) {
                int somaTotal = 0;
                
                short fazendeiros = scanner.nextShort();

                for (int j = 0; j < fazendeiros; ++j) {
                    int tamanhoFazenda = scanner.nextInt();
                    int totalAnimais = scanner.nextInt();
                    int beneficio = scanner.nextInt();

                    int animalPorMetro  = (totalAnimais / tamanhoFazenda);

                    somaTotal += ( animalPorMetro * beneficio) * totalAnimais;
                }

                System.out.println(somaTotal);



            }

           

        scanner.close();

    }
}
