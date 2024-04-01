package TeachMeSkills.Homework;
import java.util.Scanner;

/* Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую
        сумму.
        Добавьте метод, который выводит текущую информацию о карточке (номер счета, текущая сумма на счету).
        Напишите программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек. */

public class CreditCard{
    Scanner sc = new Scanner(System.in);
    double balance;
    String accountNumber;
    CreditCard(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    void incomingPayment(){
        System.out.print("Введите сумму пополнения в белорусских рублях: ");
        double sum = sc.nextDouble();
        balance += sum;
    }
    void outgoingPayment(){
        System.out.print("Введите желаемую сумму для снятия в белорусских рублях: ");
        double sum = sc.nextDouble();
        if (balance < sum){
            System.out.println("Недостаточно средств на счёте!");
        } else {
            balance -= sum;
        }
    }
    void displayAccountInfo(){
        System.out.println("Баланс: " + balance + " BYN; Номер счёта: " + accountNumber);
    }
}
