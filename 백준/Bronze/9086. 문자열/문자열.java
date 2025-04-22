import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String str[] = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < t; i++) {
            System.out.println(str[i].charAt(0) + "" + str[i].charAt(str[i].length()-1));
        }
    }
}