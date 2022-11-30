package ua.homework.Lesson10;

public class Main {
    public static void main(String[] args) {
        Pudge pudge = new Pudge();
        System.out.println(pudge.getInfo());
        Item scepter = new Item(10,40,50, "Aghanim Scepter");
        Item flaska = new Item(0,0,0, "Healing Salve");
        Item brunke = new Item();
        System.out.println(scepter.getInfo());
        pudge.addItem(scepter);
        System.out.println(pudge.getInfo());
        pudge.addItem(flaska);
        System.out.println(pudge.getInfo());
        pudge.removeItem("Aghanim Scepter");
        System.out.println(pudge.getInfo());
        pudge.addItem(brunke);
        System.out.println(pudge.getInfo());
        Pudge pudge1 = new Pudge();
        Dota2 dota2 = new Dota2();
        dota2.pudgeFigth(pudge,pudge1);

    }
}
