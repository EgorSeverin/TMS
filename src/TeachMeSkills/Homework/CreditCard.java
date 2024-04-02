package TeachMeSkills.Homework;
import java.util.Scanner;

public class CreditCard{
    Scanner sc = new Scanner(System.in);
    private double balance;
    private final String accountNumber;
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
        System.out.println("Баланс: " + balance + " BYN; Номер счёта: " + accountNumber + ";");
    }
}
