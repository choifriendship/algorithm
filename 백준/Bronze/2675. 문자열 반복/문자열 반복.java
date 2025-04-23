import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < s; i++) {
            String[] input = sc.nextLine().split(" ");
            int repeat = Integer.parseInt(input[0]);
            String str = input[1];

            System.out.println(repeatCode(repeat, str));
        }
    }

    public static String repeatCode(int repeat, String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            for(int j = 0; j < repeat; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}