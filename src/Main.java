import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input1 = "I did, diD I?";
        System.out.println(palindromCheck(input1));
    }
    public static boolean palindromCheck(String input1){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder build = new StringBuilder(input1.length());
        input1 = input1.toLowerCase();

        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) >= 'a' && input1.charAt(i) <= 'z') {
                build.append(input1.charAt(i));
                stack.push(input1.charAt(i));
            }
        }

        StringBuilder reverse = new StringBuilder(build.capacity());

        while(!stack.isEmpty()) {
            reverse.append(stack.peek());
            stack.pop();
        }

        return reverse.toString().equals(build.toString());
    }
}
