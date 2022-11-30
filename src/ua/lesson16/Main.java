package ua.lesson16;

public class Main {
    public static void main(String[] args) {
        DbConnector dbConnector = new DbConnector();
        PudgeDBController pudgeDBController = new PudgeDBController(dbConnector);

        //Pudge pudge = new Pudge(1, "Pudge", "Dismember",11);

       // pudgeDBController.addPudge(pudge);

        Pudge pudge = pudgeDBController.getPudgeById(1);
        System.out.println(pudge);
    }
}
