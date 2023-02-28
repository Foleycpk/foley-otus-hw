import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = createList();
        print(list);
        long startTimeSorting = System.currentTimeMillis();
        List<Integer> sortedList =  sort(list);
        long endTimeSorting = System.currentTimeMillis();
        print(sortedList);
        System.out.println("Скорость работы сортировки методом выбора: " + (endTimeSorting - startTimeSorting));

        startTimeSorting = System.currentTimeMillis();
        Collections.sort(list);
        endTimeSorting = System.currentTimeMillis();
        System.out.println("Скорость работы сортировки с помощью : Collections.sort(): " + (endTimeSorting - startTimeSorting));
    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            list.add((int) (Math.random() * 7));
        }
        return list;
    }

    private static List<Integer> sort(List<Integer> list) {
        List<Integer> copyList = copyList(list);

        int indexOfMin = -1;

        for (int i = 0; i < copyList.size() - 1; i++) {
            int min = copyList.get(i);
            for (int j = i; j < copyList.size(); j++) {
                if (copyList.get(j) < min) {
                    min = copyList.get(j);
                    indexOfMin = j;
                }
            }
            if (min != copyList.get(i)) {
                int tmp = copyList.get(i);
                copyList.set(i, min);
                copyList.set(indexOfMin, tmp);
            }
        }
        return copyList;
    }
    private static void print(List<Integer> list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
    
    private static List<Integer> copyList(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>();
        for (Integer element : list) {
            copyList.add(element);
        }
        return copyList;
    }
}