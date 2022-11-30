package ua.homework.lesson13;

import java.util.Arrays;

public class Pudge implements Cloneable{
    int intelligence;
    int agility;
    int strength;
    int healthPoint;
    int strikePower;
    Item[] items = new Item[2];
    int itemCount = 0;

    public Pudge() {
        this.agility = 5;
        this.strength = 5;
        this.intelligence = 5;
        this.healthPoint = 100;
        setStrikePower();
    }

    public Pudge(int intelligence, int agility, int strength) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
    }

    public void setStrikePower() {
        this.strikePower = (this.intelligence / 3) + ((this.agility / 2) + this.strength);
    }

    public int getStrikePower(){
        return this.strikePower;
    }

    public void attack(int strikePower){
        this.healthPoint -= strikePower;
    }

    public int getHealtsPoint(){
        return this.healthPoint;
    }

    void addItem(Item item) {
        if (itemCount == 2) {
            System.out.println("Pudge Have a full slots");
        } else {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = item;
                    this.intelligence += item.getIntelligence();
                    this.strength += item.getStrength();
                    this.agility += item.getAgility();
                    itemCount++;
                    break;
                }
            }
        }
        setStrikePower();
    }

    private void setItems(Item[] items) {
        this.items = items;
    }

    void removeItem(String itemName){
        for(int i = 0; i < items.length; i++){
            if(items[i].getName().equalsIgnoreCase(itemName)){
                this.intelligence -= items[i].getIntelligence();
                this.strength -= items[i].getStrength();
                this.agility -= items[i].getAgility();
                items[i] = null;
                itemCount--;
            }
        }
    }



    @Override
    public String toString() {
        return "Pudge{" +
                "intelligence=" + intelligence +
                ", agility=" + agility +
                ", strength=" + strength +
                ", healthPoint=" + healthPoint +
                ", strikePower=" + strikePower +
                ", items=" + Arrays.toString(items) +
                ", itemCount=" + itemCount +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pudge pudge = (Pudge) super.clone();
        Item[] items1 = items.clone();
        pudge.setItems(items1);
        return pudge;
    }
}
