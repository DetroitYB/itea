package emo;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary){
        super(name,salary);
        bonus = 0;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getName() {
        return "Manager";
    }


    @Override
    public String toString(){
        return super.toString() + "[bonus=" + bonus + " ]";
    }
}
