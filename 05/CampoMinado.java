import java.util.Scanner;

class CampoMinado {
    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);

        short iteration = 1;

        while (scanner.hasNext()) {
            short x = scanner.nextShort();
            short y = scanner.nextShort();
            
            if (x == 0 && y == 0) break;
            
            short[][] campo = new short[x][y];

            // capeta de scanner que não descarta o \n quando usa nextShort()
            scanner.nextLine();


            for (short i = 0; i < x; i++) {
                String line = scanner.nextLine();
                for (short j = 0; j < y; j++) {
                    campo[i][j] = (short) (line.charAt(j) == '*' ? -1 : 0);
                }
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (campo[i][j] == -1) {
                        // parede de cima
                        if (i > 0) {
                            if (campo[i-1][j] != -1) campo[i-1][j]++;

                            // quina esquerda
                            if (j > 0) {
                                if (campo[i-1][j-1] != -1) campo[i-1][j-1]++;
                            }

                            // quina direita
                            if (j < y-1) {
                                if (campo[i-1][j+1] != -1) campo[i-1][j+1]++;
                            }

                        }
                        // parede de baixo
                        if (i < x-1) {
                            if (campo[i+1][j] != -1) campo[i+1][j]++;

                            // quina esquerda
                            if (j > 0) {
                                if (campo[i+1][j-1] != -1) campo[i+1][j-1]++;
                            }
                            if (j < y-1) {
                                if (campo[i+1][j+1] != -1) campo[i+1][j+1]++;
                            }
                        }

                        // parede da esquerda
                        if (j > 0) {
                            if (campo[i][j-1] != -1) campo[i][j-1]++;
                        }

                        // parede da direita
                        if (j < y-1) {
                            if (campo[i][j+1] != -1) campo[i][j+1]++;
                        }

                    }
                }
            }

            System.out.printf("Campo #%d:\n", iteration++);

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(campo[i][j] == -1 ? "*" : campo[i][j]);
                }
                System.out.println();
            }
             
        }

        scanner.close();

    }
}