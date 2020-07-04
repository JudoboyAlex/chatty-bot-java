import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int end = sc.nextInt();
        for (int i = 0; i < end; i++) {
            int n = sc.nextInt();
            if (n % 6 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}