public class taylor{


public static double Taylor(int a, int terms) {
    double xRad = Math.toRadians(a);
    return recursive(xRad, 0, terms);
}


public static double recursive(double A, int n, int terms) {
    if (n >= terms) {
        return 0;
    }


    double sign = (n % 2 == 0) ? 1 : -1;
    double power = Math.pow(A, 2 * n + 1);
    double factorialValue = factorial(2 * n + 1);

    double term = sign * (power / factorialValue);


    return term + recursive(A, n + 1, terms);
}


public static double factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
}