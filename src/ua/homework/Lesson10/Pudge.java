package ua.homework.Lesson10;

public class Pudge {
    int intelligence;
    int agility;
    int strength;
    int healthPoint;
    int strikePower;
    Item[] items = new Item[2];
    int itemCount = 0;

    {
        this.agility = 5;
        this.strength = 5;
        this.intelligence = 5;
        this.healthPoint = 100;
        setStrikePower();
    }

    public Pudge() {

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


    public String getInfo() {
        return "HealthPoint : " + this.healthPoint +
                "; agility : " + this.agility +
                "; strength : " + this.strength +
                "; intelligence : " + this.intelligence +
                "; item[0] " + items[0] +
                "; item[1] " + items[1] +
                "; StrikePower : " + this.strikePower;
    }
}
