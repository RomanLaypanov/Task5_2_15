import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<Integer> list = new ArrayList<>();

        String[] numbers = s.split(" ");
        for (String number : numbers) {
            list.add(Integer.valueOf(number));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }

        Collections.reverse(list);

        System.out.println(list);

        sc.close();
    }
}