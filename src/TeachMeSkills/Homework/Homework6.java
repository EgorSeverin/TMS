package TeachMeSkills.Homework;


public class Homework6 {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(15.5, "4018 7894 1236 5807");
        CreditCard secondCard = new CreditCard(0, "4018 7894 1236 7854");
        CreditCard thirdCard = new CreditCard(258, "4018 7894 1236 9863");

        firstCard.incomingPayment();
        secondCard.incomingPayment();
        thirdCard.outgoingPayment();

        firstCard.displayAccountInfo();
        secondCard.displayAccountInfo();
        thirdCard.displayAccountInfo();
    }
}
