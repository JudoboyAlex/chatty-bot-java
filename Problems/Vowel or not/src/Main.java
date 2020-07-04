import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        String str = String.valueOf(ch);
        if (str.contains("a") || str.contains("A") || str.contains("e") || str.contains("E") || str.contains("i") || str.contains("I") || str.contains("o") || str.contains("O") || str.contains("u") || str.contains("U")){
            return true;
        } else {
            return false;
        }
//        if ( str == "a" || str == "A" || str =="e" || str =="E" || str=="i" || str=="I" || str=="o" || str=="O" || str=="u" || str=="U"){
//            return true;
//        } else {
//            return false;
//        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}