import java.io.IOException;
import java.util.Scanner;

interface Main {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        int d = N;

        do {
            int a = d/10;
            int b = d%10;

            int c = (a+b)%10;
            d = b*10 + c;
            cnt++;
        } while(d != N);

        System.out.println(cnt);

    }
}