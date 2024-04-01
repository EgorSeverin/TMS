package TeachMeSkills.Homework;
import java.util.Arrays;
import java.util.Scanner;

public class Homework3and4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Одномерные массивы. Задание 1
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
        int element = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (i == element) {
                System.out.println("В массиве присутствует ввдённое число: " + element + ".");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("В массиве ввдённое число " + element + " не найдено.");
        }
        sc.close();

        // Одномерные массивы. Задание 2
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.print("Введите число для удаления: ");
        element = sc.nextInt();
        int count = 0;
        for (int i : array){
            if (i == element) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Введённое число в массиве не найдено");
        } else {
            int[] newArray = new int[array.length - count];
            int index = 0;
            for (int i : array) {
                if (i != element) {
                    newArray[index++] = i;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(newArray));
        }

        // Одномерные массивы. Задание 3
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        double avg = Arrays.stream(array).average().getAsDouble();
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);

        // Одномерные массивы. Задание 4
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        double avg1 = Arrays.stream(array1).average().getAsDouble();
        double avg2 = Arrays.stream(array2).average().getAsDouble();
        if (avg1 < avg2) {
            System.out.println("Среднее арифметическое элементов массива array2 больше среднего арифметического элементов массива array1");
        } else if (avg1 > avg2) {
            System.out.println("Среднее арифметическое элементов массива array1 больше среднего арифметического элементов массива array2");
        } else {
            System.out.println("Среднее арифметическое элементов массивов array1 и array2 равны");
        }

        // Одномерные массивы. Задание 5
        System.out.print("Введите размер массива: ");
        size = 0;
        while (!sc.hasNextInt()){
            System.out.println("Введите число!");
            sc.next();
        }
        size = sc.nextInt();
        while (size <=5 || size >10) {
            System.out.println("Размер массива может быть больше 5 и меньше или равно 10");
            System.out.print("Введите размер массива: ");
            size = sc.nextInt();
        }
        System.out.println("Введено правильное число");
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        count = 0;
        for (int i : array){
            if (i % 2 != 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Все числа в массиве чётные");
        } else {
            int[] newArray = new int[array.length - count];
            int index = 0;
            for (int i : array) {
                if (i % 2 == 0) {
                    newArray[index++] = i;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(newArray));
        }

        // Одномерные массивы. Задание 6
        System.out.print("Введите размер массива: ");
        size = 0;
        while (!sc.hasNextInt()){
            System.out.println("Введите число!");
            sc.next();
        }
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(array));

        // Многомерные массивы. Задание 1
        String[][] arrayString = new String[8][8];
        for (int i = 0; i < arrayString.length; i++)
        {
            for (int j = 0; j < arrayString[0].length; j++)
            {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    arrayString[i][j] = "W";
                } else {
                    arrayString[i][j] = "B";
                }
            }
            System.out.println(" " + Arrays.toString(arrayString[i]));
        }

        // Многомерные массивы. Задание 2
        int n = 0;
        int m = 0;
        System.out.print("Введите высоту массива: ");
        while (!sc.hasNextInt()){
            System.out.println("Введите число!");
            sc.next();
        }
        n = sc.nextInt();
        System.out.print("Введите ширину массива: ");
        m = sc.nextInt();
        int[][] arrayMulti = new int[n][m];
        System.out.println("Полученный массив:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayMulti[i][j] = (int) (Math.random() * 10);
                sum+=arrayMulti[i][j];
            }
            System.out.println(" " + Arrays.toString(arrayMulti[i]));
        }
        System.out.println("Сумма всех элементов массива равна: " + sum);

        // Многомерные массивы. Задание 3
        System.out.print("Введите высоту массива: ");
        while (!sc.hasNextInt()){
            System.out.println("Введите число!");
            sc.next();
        }
        int i = 0;
        int j = 0;
        n = sc.nextInt();
        System.out.print("Введите ширину массива: ");
        m = sc.nextInt();
        int[][] arrayMulti1 = new int[n][m];
        System.out.println("Полученный массив:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arrayMulti1[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(" " + Arrays.toString(arrayMulti1[i]));
        }
        System.out.print("Главная диагональ:");
        for (i = 0; i < (Math.min(arrayMulti1[0].length, arrayMulti1.length)); i++) {
            System.out.print(arrayMulti1[i][i] + " ");
        }
        System.out.print("\nПобочная диагональ:");
        for (i = 0; i < (Math.min(arrayMulti1[0].length, arrayMulti1.length)); i++) {
            System.out.print(arrayMulti1[i][arrayMulti1[0].length-i-1] + " ");
        }

        // Многомерные массивы. Задание 4
        System.out.print("Введите высоту массива: ");
        while (!sc.hasNextInt()){
            System.out.println("Введите число!");
            sc.next();
        }
        n = sc.nextInt();
        System.out.print("Введите ширину массива: ");
        m = sc.nextInt();
        arrayMulti = new int[n][m];
        System.out.println("Полученный массив:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arrayMulti[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(" " + Arrays.toString(arrayMulti[i]));
        }
    }
}
