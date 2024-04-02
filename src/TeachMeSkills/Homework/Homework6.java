package TeachMeSkills.Homework;


public class Homework6 {
    public static void main(String[] args) {

        // Task #1
        CreditCard firstCard = new CreditCard(15.5, "4018 7894 1236 5807");
        CreditCard secondCard = new CreditCard(0, "4018 7894 1236 7854");
        CreditCard thirdCard = new CreditCard(258, "4018 7894 1236 9863");

        firstCard.incomingPayment();
        secondCard.incomingPayment();
        thirdCard.outgoingPayment();

        firstCard.displayAccountInfo();
        secondCard.displayAccountInfo();
        thirdCard.displayAccountInfo();

        // Additional Task #1
        Computer computer1 = new Computer(250,"Топ1000");
        Computer computer2 = new Computer(2580, "Топ100", new RAM ("DDR4", 32), new HDD("SSD", 1000, "Внуренний"));
        computer1.displayComputerInfo();
        computer2.displayComputerInfo();
    }
}
