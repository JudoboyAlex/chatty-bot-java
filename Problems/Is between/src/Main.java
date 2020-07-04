import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean Ordered1 = h3 >= h1 && h1 >= h2;
        boolean Ordered2 = h3 <= h1 && h1 <= h2;

        System.out.println(Ordered1 || Ordered2);
    }
}