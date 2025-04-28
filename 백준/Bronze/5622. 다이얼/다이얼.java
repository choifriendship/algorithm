import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Integer, List<String>> map = new HashMap<>();
        int n = 65;
        for(int i = 0; i < 8; i++) {
            int x = (i == 5|| i == 7) ? 4 : 3;
            List<String> list = new ArrayList<>();
            for (int j = 0; j < x; j++) {
                list.add(String.valueOf((char)n));
                n++;
            }
            map.put(i, list);
        }

        AtomicInteger cnt = new AtomicInteger();

        for(int j = 0; j < s.length(); j++) {
            for (int i = 0; i < map.size(); i++) {
                String str = String.valueOf(s.charAt(j));
                if(map.get(i).contains(String.valueOf(s.charAt(j)))) {
                    Optional<Integer> key = map.entrySet()
                            .stream()
                            .filter(entry -> entry.getValue().contains(str))
                            .map(Map.Entry::getKey)
                            .findFirst();
                    key.ifPresent(k -> cnt.addAndGet(k+3));
                }
            }
        }
        System.out.println(cnt);
    }
}