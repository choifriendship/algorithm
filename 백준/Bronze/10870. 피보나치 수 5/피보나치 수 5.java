import java.util.*;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = Fibonacci(Integer.parseInt(sc.nextLine()));
        System.out.println(res);
    }

    static int Fibonacci(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return Fibonacci(n-1) + Fibonacci(n-2);
    }
}