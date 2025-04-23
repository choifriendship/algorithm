import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.trim().split(" ");
        System.out.println(s.trim().isEmpty() ? 0 : words.length);
    }
}