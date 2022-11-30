package ua.homework.lesson16;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(1,2);
        Triangle triangle = new Triangle(5,2,5);
       // circle.printInfo();

//        triangle.printInfo();

        DbConnector dbConnector = new DbConnector();

        ShapeController shapeController = new ShapeController(dbConnector);
        System.out.println(shapeController.getCountOfRows("CSADASCDSAdC"));
        Shape[] shapes = new Shape[0];
        System.out.println(shapes.length);

//        Shape[] shapes = shapeController.getAllShapes("");
//
//        for(Shape shape : shapes){
//            shape.printInfo();
//        }

        //System.out.println(shapeController.getCountOfRows());



        //shapeController.addShape(triangle);

    }
}
