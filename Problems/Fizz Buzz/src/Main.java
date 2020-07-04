import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for ( ; a <= b; a++){
            if ( a % 3 == 0 && a % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (
                    a % 3 == 0
            ){
                System.out.println("Fizz");
            } else if (
                    a %  5 == 0
            ){
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }
    }
}