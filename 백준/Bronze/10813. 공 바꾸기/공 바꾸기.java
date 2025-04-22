import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 바구니 N개, 입력 수 M개
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Integer [] arr = new Integer[N];

        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt() -1;
            int j = sc.nextInt() -1;
            sc.nextLine();
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
            if ( i < N - 1 ) {
                System.out.print(" ");
            }
        }
    }
}