import java.io.IOException;
import java.util.Scanner;

interface Main {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int res = 1;

        for (int i = 1; i <= A; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}