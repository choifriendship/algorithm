import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

interface Main {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Stack<Integer> stackInt = new Stack<Integer>();

        for(int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if(tokens[0].equals("push")) {
                stackInt.push(Integer.parseInt(tokens[1]));
            }
            else if(tokens[0].equals("pop")) {
                System.out.println(stackInt.empty() ? "-1" : stackInt.pop());
            }
            else if(tokens[0].equals("size")) {
                System.out.println(stackInt.size());
            }
            else if(tokens[0].equals("empty")) {
                System.out.println(stackInt.empty() ? "1" : "0");
            }
            else if(tokens[0].equals("top")) {
                System.out.println(stackInt.empty() ? "-1" : stackInt.peek());
            }
        }
    }
}