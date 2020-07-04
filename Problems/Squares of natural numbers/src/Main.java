import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int factor = 1;
        int num = s.nextInt();
        int factored = 1;

        while(num >= factored){
            factored = factor * factor;
            if(num >= factored) {
                System.out.println(factored);
            }
            factor++;
         }
    }
}




//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner s = new Scanner(System.in);
//        int biggest = 0;
//
//        while(s.hasNext()){
//            int next = s.nextInt();
//            if(next % 4 == 0 && next > biggest){
//                biggest = next;
//            }
//        }
//        System.out.println(biggest);
//    }
//}