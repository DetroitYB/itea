package ua.homework.lesson13;

public class Dota2 {
    void pudgeFigth(Pudge pudge1, Pudge pudge2){
        System.out.println("Start Hp pudge1 " + pudge1.getHealtsPoint());
        System.out.println("Start Hp pudge2 " + pudge2.getHealtsPoint());
        System.out.println("Start StrikePower pudge1 " + pudge1.getStrikePower());
        System.out.println("Start StrikePower pudge2 " + pudge2.getStrikePower());
        while(!(pudge1.getHealtsPoint() <= 0 || pudge2.getHealtsPoint() <= 0)) {

            pudge1.attack(pudge2.getStrikePower());
            System.out.println("pudge2 нанес урон pudge1 " + pudge2.getStrikePower());
            System.out.println("New pudge1 new hp = " + pudge1.getHealtsPoint());
            pudge2.attack(pudge1.getStrikePower());
            System.out.println("pudge1 нанес урон pudge2 " + pudge1.getStrikePower());
            System.out.println("New pudge2 new hp = " + pudge2.getHealtsPoint());
        }
    }
}
