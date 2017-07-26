package puzzle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzle {

    public static void main(String[] args) {
        String FILENAME = "puzzle.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int LN = 1;
            while (currentLine != null) {
                if (LN % 3 == 0) {
                    System.out.println(currentLine);
                    currentLine = reader.readLine();
                }
                LN++;
                currentLine = reader.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
