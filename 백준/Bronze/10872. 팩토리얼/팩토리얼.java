import java.util.*;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int res = factorial(N);
        System.out.println(res);
    }

    static int factorial(int num) {
        if(num == 0) return 1;
        else return num * factorial(num - 1);
    }
}