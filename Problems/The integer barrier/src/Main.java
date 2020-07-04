import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int sum = 0;

        while(s.hasNext()){
            int num = s.nextInt();
            sum= num + sum;
            if ( sum >= 1000){
               int total = sum - 1000;
               System.out.println(total);
               break;
            } else if (
                    num == 0
            ){
                System.out.println(sum);
                break;
            }

        }
    }
}
