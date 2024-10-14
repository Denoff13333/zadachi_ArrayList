import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Создание и вывод списка
        System.out.println("Задача 1: Создание и вывод списка");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");

        for (String s : strings) {
            System.out.println(s);
        }

        // Задача 2: Удаление элементов
        System.out.println("\nЗадача 2: Удаление элементов");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.remove(3);
        System.out.println("Список после удаления:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Задача 3: Поиск элемента в списке
        System.out.println("\nЗадача 3: Поиск элемента в списке");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Peach");

        String search = "Banana";
        int index = fruits.indexOf(search);
        if (index != -1) {
            System.out.println("Элемент '" + search + "' найден на индексе: " + index);
        } else {
            System.out.println("Элемент '" + search + "' не найден.");
        }

        // Задача 4: Перебор и изменение элементов
        System.out.println("\nЗадача 4: Перебор и изменение элементов");
        ArrayList<Integer> numbersForIncrement = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbersForIncrement.add(i);
        }

        for (int i = 0; i < numbersForIncrement.size(); i++) {
            numbersForIncrement.set(i, numbersForIncrement.get(i) + 2);
        }

        System.out.println("Изменённые элементы:");
        for (Integer num : numbersForIncrement) {
            System.out.println(num);
        }

        // Задача 5: Объединение двух списков
        System.out.println("\nЗадача 5: Объединение двух списков");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Alpha");
        list1.add("Beta");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Gamma");
        list2.add("Delta");

        ArrayList<String> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        System.out.println("Объединённый список:");
        for (String s : combinedList) {
            System.out.println(s);
        }

        // Задача 6: Удаление всех элементов, начинающихся на "A"
        System.out.println("\nЗадача 6: Удаление всех элементов, начинающихся на 'A'");
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Apricot");
        words.add("Cherry");

        words.removeIf(word -> word.startsWith("A"));

        System.out.println("Список после удаления элементов, начинающихся на 'A':");
        for (String word : words) {
            System.out.println(word);
        }

        // Задача 7: Поиск максимального элемента
        System.out.println("\nЗадача 7: Поиск максимального элемента");
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(30);
        numberList.add(20);
        numberList.add(50);
        numberList.add(40);

        int maxNumber = Collections.max(numberList);
        System.out.println("Максимальный элемент: " + maxNumber);

        // Задача 8: Удаление дубликатов
        System.out.println("\nЗадача 8: Удаление дубликатов");
        ArrayList<String> duplicatesList = new ArrayList<>();
        duplicatesList.add("Apple");
        duplicatesList.add("Banana");
        duplicatesList.add("Apple");
        duplicatesList.add("Orange");
        duplicatesList.add("Banana");

        HashSet<String> uniqueElements = new HashSet<>(duplicatesList);
        System.out.println("Список после удаления дубликатов:");
        for (String item : uniqueElements) {
            System.out.println(item);
        }

        // Задача 9: Сортировка списка
        System.out.println("\nЗадача 9: Сортировка списка");
        ArrayList<String> unsortedList = new ArrayList<>();
        unsortedList.add("Beta");
        unsortedList.add("Alpha");
        unsortedList.add("Delta");
        unsortedList.add("Gamma");

        Collections.sort(unsortedList);
        System.out.println("Отсортированный список:");
        for (String item : unsortedList) {
            System.out.println(item);
        }

        // Задача 10: Реверс списка
        System.out.println("\nЗадача 10: Реверс списка");
        ArrayList<String> listToReverse = new ArrayList<>();
        listToReverse.add("One");
        listToReverse.add("Two");
        listToReverse.add("Three");

        Collections.reverse(listToReverse);
        System.out.println("Список в обратном порядке:");
        for (String item : listToReverse) {
            System.out.println(item);
        }
    }
}
