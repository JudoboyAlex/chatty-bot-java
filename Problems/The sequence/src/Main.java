import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int biggest = 0;

        while(s.hasNext()){
            int next = s.nextInt();
            if(next % 4 == 0 && next > biggest){
                biggest = next;
            }
        }
        System.out.println(biggest);
    }
}
