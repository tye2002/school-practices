import java.util.Stack;
import java.util.Scanner;
class Ex2 {

    public static void main(String[] args) {

    	System.out.print("Input:");
        Scanner input=new Scanner(System.in);
        String str = input.next();

        Stack<Object> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reverse = "";

        while (!stack.isEmpty()) {
            reverse = reverse+stack.pop();
        }

        if (str.equals(reverse))
            System.out.println("The input is a palindrome.");
        else
            System.out.println("The input is not a palindrome.");

    }
}