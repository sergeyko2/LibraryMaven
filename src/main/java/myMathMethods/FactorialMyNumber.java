package myMathMethods;

public class FactorialMyNumber {
    long f = 0;

    public long factorial(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
