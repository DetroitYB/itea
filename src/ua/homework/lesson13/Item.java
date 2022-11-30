package ua.homework.lesson13;

public class Item implements Cloneable{
    int intelligence;
    int agility;
    int strength;
    String name;


    public Item() {
        this.agility = 5;
        this.strength = 5;
        this.intelligence = 5;
        this.name = "Irun Brunke";
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

    @Override
    public String toString() {
        return "Item{" +
                "intelligence=" + intelligence +
                ", agility=" + agility +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
