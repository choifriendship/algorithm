import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String m = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            cnt += m.charAt(i) - '0';
        }

        System.out.print(cnt);
    }
}