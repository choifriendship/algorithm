import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int i = 0;
        int j = 0;

        int arr[] = new int[N];

        for (int k = 0; k < N; k++) {
            arr[k] = k + 1;
        }

        for (int x = 0; x < M; x++) {
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            sc.nextLine();
            reverse(arr, i, j);
        }

        for (int x = 0; x < N; x++) {
            System.out.print(arr[x] + " ");
        }
    }

    public static void reverse(int arr[], int str, int end) {

        while (str < end) {
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;

            str++;
            end--;
        }
    }
}