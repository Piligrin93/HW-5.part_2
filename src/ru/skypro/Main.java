package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        // Задание 1, Задание 2 и Задание 3

        int summaMonth = 0;
        for (int a = 0; a <= generateRandomArray().length - 1; a++) { // Открываем цикл для поиска суммы всех трат за месяц для Задания 1
            summaMonth += arr[a]; // Суммируем все элементы цикла
        }
        System.out.println("Summa trat za mesyash " + summaMonth);

        int maxBuying = arr[0]; // Объявление переменной для поиска max затрат за месяц для Задания 2
        int minBuyig = arr[0]; // Объявление переменной для поиска min затрат за месяц для Задания 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxBuying) {  // Поиск max переменной
                maxBuying = arr[i];
            }
            if (arr[i] < minBuyig) { // Поиск min переменной
                minBuyig = arr[i];
            }

        }
        System.out.println("Max summa trat za den " + maxBuying); // Вывод в консоль max переменной
        System.out.println("Min summa trat za den " + minBuyig); // Вывод в консоль min переменной

        double midBuying = summaMonth / 30; // Для Задания 3 объявляем переменную типа double. При изменении массива и других переменных в double, средние траты не будут округляться
        System.out.println("Srednya summa trat za mesyach " + midBuying); // а выдавать дробный остаток. Если нужно - поменяю переменные на double

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int a = reverseFullName.length-1; a >= 0; a--) { // Вывод масcива reverseFullName в обратном направлении
            if (a == 0)
                System.out.println(reverseFullName[a]);
            else
                System.out.print(reverseFullName[a] + " ");
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
