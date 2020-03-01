import java.util.Scanner;

class DennysFumante {

    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while(!"".equals(line)) {
            int n, k;
    
            String[] values; 

            values = line.split(" ");
            n = Integer.parseInt(values[0]);
            k = Integer.parseInt(values[1]);

            int cigarrosTotais = n;
            int bitucas = n;

            while (bitucas >= k) {
                cigarrosTotais += (bitucas / k);
                bitucas = bitucas / k;
            }

            System.out.println(cigarrosTotais);
            line = scanner.nextLine();
        }
    }

}