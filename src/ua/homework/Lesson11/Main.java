package ua.homework.Lesson11;

import ua.homework.Lesson11.PC;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("550w", "Rozetka");
        pc.setMotherBoard("Gaming Plus", "Asus", "AM4");
        pc.setCpu("Ryzen 5 2500x", "AMD", 4.0);
        pc.overClocking();
        System.out.println(pc.getinfo());
    }
}
