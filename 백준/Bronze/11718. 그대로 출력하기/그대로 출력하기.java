import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ( sc.hasNextLine() ) {
            String[] tokens = sc.nextLine().split("\\s");
            System.out.println(String.join(" ", tokens));
        }
    }
}