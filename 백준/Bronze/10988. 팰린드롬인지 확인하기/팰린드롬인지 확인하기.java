import java.io.IOException;
import java.util.Scanner;

interface Main {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 1;
        int len = s.length();
        for(int i = 0; i < len/2; i++) {
            if(s.charAt(i) != s.charAt(len-i-1)) {
                res = 0;
                break;
            }
        }
        System.out.println(res);
    }
}