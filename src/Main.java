import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte deinen Name geben: ");
        String name = scanner.nextLine();
        greet(name);
        String text;

        int sum = sum(2, 6);
        int substract = substract(2, 6);
        System.out.println("The Sum is " + sum);
        System.out.println("The Substract is " + substract);

        double sumDouble = sum(2.5, 3.6);
        System.out.println("The Sum of 2 kommazahlen is " + sumDouble);

        double makePositive = makePositive(-2.5555);
        System.out.println("Die positive ist  " + makePositive);

        System.out.println("write a word or sentence: ");
       text = scanner.nextLine();
       if(isPalindrome(text)){
           System.out.println("The text is palindrome.");
       }else {
           System.out.println("The text is not palindrome.");
       }

    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static int substract(int a, int b) {
        return a - b;
    }
    public static double makePositive(double x) {
        if (x < 0) {
            return -x;
        }else{
            return x;
        }
    }

    public static boolean isPalindrome(String text) {
        text = text. replaceAll("\\s", "").toLowerCase();

        int left = 0, right = text.length() - 1;
        while (left < right){
            if(text.charAt(left) != text.charAt(right)) {
                return false;
            }
                left++; right--;
            }
        return true;
    }
}
