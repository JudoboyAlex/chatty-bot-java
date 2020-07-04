import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if ( (num1 + num2) > num3 && (num1 + num3) > num2 && (num2 + num3) > num1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//1. A + B > C
//        2. A + C > B
//        3. B + C > A