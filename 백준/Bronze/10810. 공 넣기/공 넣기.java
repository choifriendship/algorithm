import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 바구니 N개, 입력 수 M개
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        Integer [] arr = new Integer[N];
        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            for (int y = i-1; y < j; y++) {
                arr[y] = k;
            }
        }


        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] == null ? 0 : arr[i]);
            if ( i < N - 1 ) {
                System.out.print(" ");
            }
        }
    }
}