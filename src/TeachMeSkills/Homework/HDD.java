package TeachMeSkills.Homework;

public class HDD {
    String name;
    int volume;
    String type;

    HDD(){}
    HDD(String name, int volume, String type){
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    @Override
    public String toString(){
        return "HDD: Название - " + name + "; Объём - " + volume + " Gb; Тип - " + type;
    }
}
