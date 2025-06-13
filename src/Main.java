import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] numbers = s.split(" ");

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                deque.addFirst(Integer.parseInt(numbers[i]));
            }
        }

        for (int i : deque) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
