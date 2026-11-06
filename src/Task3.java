import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("src/data.txt"));

            int n = file.nextInt();
            int negativeCount = 0;

            for (int i = 0; i < n; i++) {
                int temp = file.nextInt();

                if (temp < 0) {
                    negativeCount++;
                }
            }

            if (negativeCount == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println("Negative temperatures: " + negativeCount);
            }

            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}