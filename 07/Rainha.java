import java.util.Scanner;

class Rainha {

    private static boolean isSamePosition(short x1, short y1, short x2, short y2) {
        return x1 == x2 && y1 == y2;
    }

    private static boolean isSameLine(short x1, short y1, short x2, short y2) {
        return x1 == x2 || y1 == y2;
    }

    private static boolean isDiagonal(short x1, short y1, short x2, short y2) {
        return Math.abs(x1 - x2) == Math.abs(y1 -y2);
    }

    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            short x1 = scanner.nextShort();
            short y1 = scanner.nextShort();
            short x2 = scanner.nextShort();
            short y2 = scanner.nextShort();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }

            // System.out.printf("x1 = %d, y1 = %d, x2 = %d, y2 = %d, x1-x2 = %d, y1-y2 = %d, x1-y1=%d, x2-y2=%d, y2-x1=%d", x1, y1, x2, y2, x1-x2, y1-y2, x1-y1, x2-y2, y2-x1);
            
            if (isSamePosition(x1, y1, x2, y2)) {
                System.out.println(0);
            }  else if (isSameLine(x1, y1, x2, y2) || isDiagonal(x1, y1, x2, y2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }

        }

        scanner.close();

    }
}
