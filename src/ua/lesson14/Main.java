package ua.lesson14;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        InputData inputData = new InputData("1", null);

        System.out.println(service.getResult(inputData));
    }
}
