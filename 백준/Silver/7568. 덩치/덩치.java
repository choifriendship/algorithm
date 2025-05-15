import java.util.*;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int big[][] = new int[N][2];
        int rank[] = new int[N];
        int k = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++) {
                big[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++) {
            k = 0;
            for (int j = 0; j < N; j++) {
                if(j != i && big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
                    k++;
                }
            }
            rank[i] = k + 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}