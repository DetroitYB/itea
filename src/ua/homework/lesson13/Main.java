package ua.homework.lesson13;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Item item1 = new Item(10,10,10,"Aghanim Scepter");
        Item item2 = new Item(5,5,5,"Blade of Alacrity");
        Item item3 = new Item(5,5,5,"Wraith Band");
        Item item4 = new Item(1,1,1,"Bracer");

        Pudge pudge1 = new Pudge();
        Pudge pudge2 = new Pudge(10,20,5);

        System.out.println("Pudge1 : " + pudge1);
        System.out.println("Pudge2 : " + pudge2);

        pudge1.addItem(item1);
        System.out.println("Pudge1 : " + pudge1);
        Pudge pudge3 = (Pudge) pudge1.clone();
        System.out.println("Pudge3 : " + pudge3);
        System.out.println("AFTER CLONING");
        pudge3.addItem(item3);
        System.out.println("Pudge1 : " + pudge1);
        System.out.println("Pudge3 : " + pudge3);
        pudge2.addItem(item2);
        Pudge pudge4 = (Pudge) pudge2.clone();

        pudge4.addItem(item4);
        System.out.println("AFTER CLONING");
        System.out.println("Pudge2 : " + pudge2);
        System.out.println("Pudge4 : " + pudge4);

        Dota2 dota2 = new Dota2();
        dota2.pudgeFigth(pudge3,pudge4);




    }
}
