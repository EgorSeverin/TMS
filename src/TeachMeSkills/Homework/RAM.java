package TeachMeSkills.Homework;

public class RAM {
    String name;
    int volume;

    RAM(){}
    RAM(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "RAM: Название - " + name + "; Объём - " + volume + " Gb";
    }
}
