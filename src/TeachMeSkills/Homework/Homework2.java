package TeachMeSkills.Homework;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Управляющие конструкции. Задание 1
        System.out.print("Введите номер месяца, чтобы узнать пору года: ");
        String season;
        int month = sc.nextInt();
        season = switch (month) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Введённое число не является номером месяца";
        };
        System.out.println(season);

        // Управляющие конструкции. Задание 2
        System.out.print("Введите номер месяца, чтобы узнать пору года: ");
        month = sc.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            season = "Зима";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Весна";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Лето";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Осень";
        } else {
            season = "Введённое число не является номером месяца";
        }
        System.out.println(season);

        // Управляющие конструкции. Задание 3
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Введённое число чётное");
        } else {
            System.out.println("Введённое число нечётное");
        }

        // Управляющие конструкции. Задание 4
        System.out.print("Введите значение температуры: ");
        int temperature = sc.nextInt();
        if (temperature > -5){
            System.out.println("Тепло");
        } else if(temperature > -20){
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }

        // Управляющие конструкции. Задание 5
        System.out.print("Введите номер цвета радуги: ");
        String color;
        int colorNumber = sc.nextInt();
        color = switch (colorNumber) {
            case 1 -> "Красный";
            case 2 -> "Оранжевый";
            case 3 -> "Жёлтый";
            case 4 -> "Зелёный";
            case 5 -> "Голубой";
            case 6 -> "Синий";
            case 7 -> "Фиолетовый";
            default -> "Введённое число не является номером цвета радуги";
        };
        System.out.println(color);

        // Циклы. Задание 1
        for(number = 0; number < 100; number++) {
            if (number % 2 != 0) {
                System.out.print(" " + number);
            }
        }

        // Циклы. Задание 2
        number = sc.nextInt();
        int result = 0;
        if (number >= 0) {
            for (int sum = 2; sum < number; sum++) {
                result += sum;
            }
            System.out.println(result);
        }

        // Циклы. Задание 3
        int i = 0;
        while(i<=100) {
            i++;
            if (i % 7 == 0) {
                System.out.print(" " + i);
            }
        }

        // Циклы. Задание 4
        i = 10;
        while(i <= 20) {
            System.out.print(" " + i * i);
            i++;
        }

        // Доплнительно. Задание 1
        System.out.print("Введите желаемое количество выводимых членов последовательности Фибоначчи: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i]);
        }

        // Доплнительно. Задание 2
        System.out.print("Введите сумму вклада: ");
        int initialAmount = sc.nextInt();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = sc.nextInt();
        float finalAmount = initialAmount;
        for (int depositTerm = 0; depositTerm < period; depositTerm++) {
            finalAmount = (float) (finalAmount*(1.07));
        }
        System.out.print("Итоговая сумма на конец периода: " + finalAmount);

        // Доплнительно. Задание 3
        System.out.print("Введите число строк таблицы умножения: ");
        int lines = sc.nextInt();
        System.out.print("Введите число столбцов таблицы умножения: ");
        int columns = sc.nextInt();
        System.out.println("Таблица умножения выглядит так: ");
        for( i = 1; i <= lines; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(j * i + "  ");
            }
            System.out.println("");
        }
    }
}
