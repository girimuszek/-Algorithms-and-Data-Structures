public class Test {
    public static void main(String[] args) {
        Stack<Integer> S = new ArrayStack<>();
        for (int i = 0; i < 2; i++)
            S.pop();
        for (int i = 0; i < 24; i++)
            S.push(3);
        for (int i = 0; i < 24; i++)
            S.top();
        for (int i = 0; i < 6; i++)
            S.pop();
        System.out.println("Final stack size is: " + S.size()); 

    }
}