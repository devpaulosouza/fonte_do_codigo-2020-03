import java.util.Scanner;

class Chocolate {

    private static int getQuadrant(int dimensions, int x, int y) {
        int root = dimensions / 2;

        if (x <= root && y <= root)
            return 1;
        else if (x > root && y <= root) 
            return 2;
        else if (x > root && y < root) 
            return 3;
        else 
            return 4;
    }

    private static boolean canDivide(int dimensions, int x1, int y1, int x2, int y2) {
        if (dimensions % 2 != 0) return false;

        int q1 = getQuadrant(dimensions, x1, y1);
        int q2 = getQuadrant(dimensions, x2, y2);

        return q1 != q2;
    }

    public static void main (String ...args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions, x1, y1, x2, y2;

        dimensions = scanner.nextInt();
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.print(canDivide(dimensions, x1, y1, x2, y2) ? 'S' : 'N');
    }

}
