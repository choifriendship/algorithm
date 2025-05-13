import java.util.*;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fakeDwarf[] = new int[9];   // 가짜 난쟁이 9명
        int realDwarf[] = new int[7];   // 진짜 난쟁이 7명
        boolean isDwarf = false;
        
        // 가짜 난쟁이가 포함된 9명의 키를 받는다.
        for (int i = 0; i < 9; i++) {
            fakeDwarf[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < fakeDwarf.length && !isDwarf; i++) {
            for (int j = i + 1; j < fakeDwarf.length; j++) {
                    isDwarf = res(fakeDwarf, i, j);
                    if (isDwarf) break;
            }
        }
    }

    static boolean res(int fakeDwarf[], int i, int j) {

        int realDwarf[] = new int[7];
        int idx = 0;
        int sum = 0;

        for (int k = 0; k < 9; k++) {
            if(k == i || k == j) continue;
            realDwarf[idx++] = fakeDwarf[k];
            sum += fakeDwarf[k];
        }

        if (sum == 100) {
            Arrays.stream(realDwarf).sorted().forEach(System.out::println);
            return true;
        }
        return false;
    }
}