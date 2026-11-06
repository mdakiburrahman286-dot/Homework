import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(); // laptop price
        int s = sc.nextInt(); // saved money
        int m = sc.nextInt(); // weekly savings

        int k = 0;

        while (s < p) {
            s += m;
            k++;
        }

        System.out.println(k);
    }
}