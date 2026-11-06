import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("duomenys.txt"));

            int n = file.nextInt();

            int previous = file.nextInt();
            int count = 0;

            for (int i = 1; i < n; i++) {
                int current = file.nextInt();

                if (current < previous) {
                    count++;
                }

                previous = current;
            }

            System.out.println(count);

            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}