/*import java.util.*;
class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine(), result = "";
        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                s.push(c);
            else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(')
                    result += s.pop();
                s.pop();
            } else {
                while (!s.isEmpty() && s.peek() != '(' &&
                       (c == '+' || c == '-' || s.peek() == '*' || s.peek() == '/'))
                    result += s.pop();
                s.push(c);
            }
        }
        while (!s.isEmpty())
            result += s.pop();
        System.out.println("Postfix: " + result);
    }
}
import java.util.*;
class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.print("Enter postfix expression: ");
        String exp = sc.nextLine();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c))
                s.push(c - '0');
            else {
                int b = s.pop(), a = s.pop();
                switch (c) {
                    case '+': s.push(a + b); break;
                    case '-': s.push(a - b); break;
                    case '*': s.push(a * b); break;
                    case '/': s.push(a / b); break;
                }
            }
        }
        System.out.println("Result: " + s.pop());
    }
}*/
import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
    }
}
class Lab5 {
    static Node root;
    static Node insert(Node r, int x) {
        if (r == null) return new Node(x);
        if (x < r.data) r.left = insert(r.left, x);
        else if (x > r.data) r.right = insert(r.right, x);
        return r;
    }
    static Node delete(Node r, int x) {
        if (r == null) return null;
        if (x < r.data) r.left = delete(r.left, x);
        else if (x > r.data) r.right = delete(r.right, x);
        else {
            if (r.left == null) return r.right;
            if (r.right == null) return r.left;
            Node t = r.right;
            while (t.left != null) t = t.left;
            r.data = t.data;
            r.right = delete(r.right, t.data);
        }
        return r;
    }
    static void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }
    static void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }
    static void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.print("\nPreorder: ");
        preorder(root);
        System.out.print("\nPostorder: ");
        postorder(root);
        System.out.print("\nEnter value to delete: ");
        root = delete(root, sc.nextInt());
        System.out.print("After deletion: ");
        inorder(root);
    }
}