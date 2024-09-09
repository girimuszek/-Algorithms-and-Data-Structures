import java.util.*;


public class sumTill {

    public static int sumTill(int n){
        int nn = (n - 1);
        int nnn;
        int nnnn = 0;

        if (n < 0) {

            System.out.println("Not a positive number");

        }
        else {

            while (nn > 0) {

                nnn = (int) Math.pow(nn, 2);

                nnnn = nnn + nnnn;

                nn--;

            }

        }

        System.out.println("Sum of squares of " + " " + n + " " + "is" + " " + nnnn);
        return nnnn;
    }



    }

