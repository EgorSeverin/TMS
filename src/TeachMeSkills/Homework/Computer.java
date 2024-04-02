package TeachMeSkills.Homework;

public class Computer {
    private final int cost;
    private final String model;
    private HDD hdd;
    private RAM ram;

    Computer(int cost, String model){
        this.cost = cost;
        this.model = model;
    }
    Computer(int cost, String model, RAM ram, HDD hdd){
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    void displayComputerInfo(){
        System.out.println("Стоимость: " + cost + " $; Модель: " + model + "; " + ram + "; " + hdd + ";");
    }
}
