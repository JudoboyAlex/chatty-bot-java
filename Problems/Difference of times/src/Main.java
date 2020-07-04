import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int hour1 = a * 3600;
        int minute1 = b * 60;
        int second1 = c;
        int hour2 = d * 3600;
        int minute2 = e * 60;
        int second2 = f;
        int total1 = hour1 + minute1 + second1;
        int total2 = hour2 + minute2 + second2;
        int total = total2 - total1;


        System.out.println(total);
    }
}