import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int counter = 0;

        for ( int i = 1; i <= num; i++ ){
            for ( int j = 1; j < (i+1); j++ ){
                counter ++;
                if ( counter <= num ){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

