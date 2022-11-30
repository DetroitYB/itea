package ua.homework.Lesson10;

public class Item {
    int intelligence;
    int agility;
    int strength;
    String name;

    {
        this.agility = 5;
        this.strength = 5;
        this.intelligence = 5;
        this.name = "Irun Brunke";
    }

    public Item() {

    }
    public Item(int intelligence, int agility, int strength, String name) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
        this.name = name;
    }

    String getName(){
        return name;
    }

    int getIntelligence(){
        return this.intelligence;
    }

    int getAgility(){
        return this.agility;
    }

    int getStrength(){
        return this.strength;
    }

    public String getInfo() {
        return "name : " + this.name +
                "; agility : " + this.agility +
                "; strength : " + this.strength +
                "; intelligence : " + this.intelligence;
    }
}
