import java.util.*;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Queue<Integer> q = new LinkedList<>();

        while (N-- > 0) {
            String[] cmd = sc.nextLine().split(" ");

            if (cmd[0].equals("push")) {
                q.offer(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                System.out.println(q.isEmpty() ? "-1" : q.poll());
            } else if (cmd[0].equals("size")) {
                System.out.println(q.size());
            } else if (cmd[0].equals("empty")) {
                System.out.println(q.isEmpty() ? "1" : "0");
            } else if (cmd[0].equals("front")) {
                System.out.println(q.isEmpty() ? "-1" : q.peek());
            } else if (cmd[0].equals("back")) {
                System.out.println(q.isEmpty()? "-1" : ((LinkedList<Integer>) q).getLast());
            }
        }
    }
}