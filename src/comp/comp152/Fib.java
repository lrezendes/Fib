package comp.comp152;

public class Fib {
    public static void main(String[] args) {
        int n = 10;

        long answer = fibLoop(n);
        System.out.println("fib(" + n + ") is " + answer);
    }

    public static int fib(int n) {
        if(n < 2)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    public static int fibLoop(long n) {
        long num1 = 0, num2 = 1;
        for(long i = 0; i < n; ++i) {
            long sum = num1 + num2;
            num1 = num2;
            num2 = num1;
        }
        return num2;
    }
}
