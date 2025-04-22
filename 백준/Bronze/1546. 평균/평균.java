import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();

        int arr[] = Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = Arrays.stream(arr).max().getAsInt();

        double conArr[] = Arrays.stream(arr).mapToDouble(x -> (double)x / M * 100).toArray();
        
        System.out.print(Arrays.stream(conArr).average().getAsDouble());
    }
}