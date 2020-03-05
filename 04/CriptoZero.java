import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

class CriptoZero {

    private static boolean  isAlpha(char a) {
        return (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z');
    }

    private static char encrypt(char a, int key) {
        char n;
        // System.out.print("a = " + (int) a + ", key = " + key);
        if (a > 'Z') {
            if (key >= 0)
                n = (char) ((a + key) % 'z');
            else {
                n = (char) (a +  26 + key);
            }
        } else {
            if (key > 0)
                n = (char) ((a + key) % 'Z');
            else {
                n = (char) (a + 26 + (key%27));
            }
        }
        // System.out.println(", res = " + (int) n);

        return n;
    }

    public static void main (String ...args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> keys = new ArrayList<>();

        int current;

        while ((current = scanner.nextInt()) != 0) {
            keys.add(current);
        }


        keys.stream().forEach(System.out::println);

        // scanner lixo que lê o int e deixa o \n no buffer
        scanner.nextLine();

        String line = "";
        while(scanner.hasNext()) {
            line = scanner.nextLine();
            StringBuilder encrypted = new StringBuilder();

            int iKey = 0;

            System.out.println(line.toCharArray());
            for (char a : line.toCharArray()) {
                if (isAlpha(a)) {
                    encrypted.append(encrypt(a, keys.get(iKey)));
                    iKey = (iKey + 1) % keys.size();
                } else {
                    encrypted.append(a);
                }
            }
            System.out.println(encrypted.toString());
        }
        
        scanner.close();
    }

}
