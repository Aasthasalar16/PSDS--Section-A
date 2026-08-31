import java.util.Scanner;
class Stack {
    char[] arr;
    int top;

    Stack(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char ch) {
        arr[++top] = ch;
    }

    char pop() {
        return arr[top--];
    }

    char peek() {
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class InfixToPostfix {
    static int priority(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;

        return 0;
    }

    static String convert(String infix) {

        Stack stack = new Stack(infix.length());
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }

                stack.pop(); // Remove '('
            }
            else {
                while (!stack.isEmpty()
                        && priority(stack.peek()) >= priority(ch)) {
                    postfix += stack.pop();
                }

                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression: ");
        String infix = sc.nextLine();

        String postfix = convert(infix);

        System.out.println("Postfix Expression: " + postfix);

        sc.close();
    }
}
