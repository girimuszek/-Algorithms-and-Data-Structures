import java.util.Stack;

public class transfer {

    public static void Transfer(Stack<Integer> S, Stack<Integer>T){

        while(!S.isEmpty()){
            T.push(S.pop());
        }


    }
}
