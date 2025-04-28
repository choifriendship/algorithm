import java.io.IOException;
import java.util.Scanner;

interface Main {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res = -1;

        for (int i = N/5; i >= 0; i--) {
            int n = N - (i*5);
            if(n%3==0) {
                res = i + (n/3);
                break;
            }
        }
        System.out.println(res);
    }
}