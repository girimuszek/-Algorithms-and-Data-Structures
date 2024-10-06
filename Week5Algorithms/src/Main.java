import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Question 1:");

        int a = 44;
        int terms = 5;
        taylor t = new taylor();
        double output = t.Taylor(a, terms);

        System.out.println(output);

        System.out.println("Question 2:");
        Test T = new Test();
        T.main(args);

        System.out.println("Question 3:");

        transfer tr = new transfer();

        Stack<Integer> S = new Stack<>();
        Stack<Integer> TT = new Stack<>();

        S.push(1);
        S.push(4);
        S.push(21);

        System.out.println("Stack S before swap: " + S);
        System.out.println("Stack T before swap: " + TT);
        tr.Transfer(S, TT);

        System.out.println("Stack S after swap: " + S);
        System.out.println("Stack T after swap: " + TT);

        System.out.println("Question 4:");
        Test2 T2 = new Test2();
        T2.main(args);


        }
    }
