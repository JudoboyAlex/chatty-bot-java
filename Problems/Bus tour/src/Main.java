import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);

        int height = s.nextInt();
        int num = s.nextInt();

        for ( int i = 0; i < num; i++){
            int height2 = s.nextInt();

            if (height2 > height){
                if ( i == (num-1)) {
                    System.out.println("Will not crash");
                }
            } else {
                System.out.println("Will crash on bridge " + (i+1));
                break;
            }

        }
    }
}

