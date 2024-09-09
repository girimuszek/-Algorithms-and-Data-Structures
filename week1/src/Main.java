//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
    int k = 0;

    System.out.println("Question 1 Answer:");
    even(5);

    System.out.println("Question 2 Answer: ");
    sumTill st = new sumTill();
    st.sumTill(5);

    System.out.println("Question 3 Answer: ");

    Quest3 q3 = new Quest3();

    q3.Quest3("1 2 3 4 5 7 8");

    System.out.println("Question 4 Answer: ");

    VowelCounter vc = new VowelCounter();

    vc.vowelCounter("ap o o u  i E rt");

    System.out.println("Missing script for last question is: ");
    System.out.println("md.printMe();");
    System.out.println("east.printMe();");
    System.out.println("obj.printMe();");
    System.out.println("usa.printMe();");
    System.out.println("md.printMe();");







    }




    public static int even(int k) {

        while (k > 0) {

            k = k - 2;

        }

        if (k == 0) {

            System.out.println("True");
        }
        else {

            System.out.println("False");

        }

        return k;


    }

}