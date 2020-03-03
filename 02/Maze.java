import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

class Maze {
    private static boolean isNaN(int value) {
        return !(value >= '0' && value <= '9');
    }


    public static void main (String ...args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder content = new StringBuilder();

        int value;

        int prevNumber = 0, prevChar = 0;

        try {
            while ((value = reader.read()) != -1) {
                if (isNaN(value)) {

                    if (value == '!') {
                        content.append('\n');
                    } if (value == '\n' && prevChar != '!') {
                        content.append('\n');
                    } else if (value == 'b') {
                        content.append(' ');
                    } else {
                        for (int i = 0; i < prevNumber; ++i) {
                            content.append((char) value);
                        }
                    }

                    prevChar = value;
                    prevNumber = 0;
                } else {
                    prevNumber += value - 48;
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        System.out.print(content);

    }
}
