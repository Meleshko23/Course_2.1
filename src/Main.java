import java.util.*;

public class Main {
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
    }

    private static void doTask1() {
        System.out.println("Нечетные числа в списке:");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    private static void doTask2() {
        System.out.println("Четные числа без повторений:");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> result = new TreeSet<>(nums);
        for (Integer num : result) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    private static void doTask3() {
        System.out.println("Уникальные слова:");
        List<String> words = new ArrayList<>(List.of("арон", "бора", "барн", "бора", "нора", "борн", "нора", "арон", "роба"));
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
    }

    private static void doTask4() {
        System.out.println("Количество дублей из списка слов:");
        List<String> words = new ArrayList<>(List.of("арон", "бора", "барн", "бора", "нора", "бора", "нора", "арон", "роба"));
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

}