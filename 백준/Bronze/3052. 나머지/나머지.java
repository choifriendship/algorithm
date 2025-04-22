import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt = 0;

        for (int j = 0; j < 10; j++) {
            int i = sc.nextInt();
            sc.nextLine();
            arr[j] = i%42;
        }

        arr = Arrays.stream(arr).distinct().toArray();

        System.out.println(arr.length);
    }
}