import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int counter = 0;

        while(s.nextInt() != 0){
            counter ++;
        }
        System.out.println(counter);
    }
}





//class Main {
//    public static void main(String[] args) {
//        // put your code here
//
//        int sum = 0;
//        while(s.hasNext()){
//            int num1 = s.nextInt();
//            sum += num1;
//        }
//        System.out.println(sum);
//    }
//}