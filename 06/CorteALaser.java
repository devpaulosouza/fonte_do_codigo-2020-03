import java.util.Scanner;

class CorteALaser {
    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            short x = scanner.nextShort();
            short y = scanner.nextShort();
            
            boolean laserLigado = false;
            int vezesLaserLigado = 0;

            if (x == 0 && y == 0) break;

            int[] tabua = new int[y];

            for (int i = 0; i < y; ++i) {
                tabua[i] = scanner.nextInt();
            }

            for (int i = 0; i < x; ++i) {
                for(int j = 0; j < y; ++j) {
                    if (tabua[j] > i) {
                        if (!laserLigado) {
                            laserLigado = true;
                            vezesLaserLigado++;
                        }
                    } else {
                        laserLigado = false;
                    }
                    // System.out.printf("i = %d, j = %d, cortar = %d, vezes = %d\n", i, j, tabua[j], vezesLaserLigado);

                }
            }

            System.out.println(vezesLaserLigado);

        }

        scanner.close();

    }
}