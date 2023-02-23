import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = createList();
        print(list);
        sort(list);
        print(list);
    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random() * 7));
        }
        return list;
    }

    private static void sort(List<Integer> list) {
        int indexOfMin = -1;

        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    indexOfMin = j;
                }
            }
            if (min != list.get(i)) {
                int tmp = list.get(i);
                list.set(i, min);
                list.set(indexOfMin, tmp);
            }
        }
    }
    private static void print (List<Integer> list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}