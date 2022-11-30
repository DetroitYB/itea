package ua.homework.lesson17;

import ua.homework.Lesson11.PC;
import ua.homework.lesson16.Circle;
import ua.homework.lesson16.Shape;
import ua.homework.lesson16.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ShapeGUI extends JFrame {

    private static final int WIDTH = 1000;
    private static final int HEIGTH = 1000;

    private Circle circle = null;
    private Triangle triangle = null;

    private JPanel panel = null;
    private JLabel[] jLabelsArray = null;
    private final JButton createCircle = new JButton("Create Circle");
    private final JButton createTriangle = new JButton("Create Triangle");
    private final JButton createRectangle = new JButton("Create Rectangle");
    private final JButton walkWithDog = new JButton("Walk with DOG");
    private final JButton calculatePerimeterCircle = new JButton("calculatePerimeter");
    private final JButton calculateSquareCircle = new JButton("calculatePerimeter");

    private final JButton calculatePerimeterTriangle = new JButton("calculatePerimeter");
    private final JButton calculateSquareTriangle = new JButton("calculatePerimeter");

    private final JTextField textField = new JTextField("");

    private final JButton back = new JButton("Back");
    private final JLabel result = new JLabel();

    private final JTextField side1 = new JTextField("");
    private final JTextField side2 = new JTextField("");
    private final JTextField side3 = new JTextField("");

    private int currentPositionOfDog = 0;
    private JButton left = new JButton("LEFT");
    private JButton rigth = new JButton("RIGTH");
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Misha\\Desktop\\dog.jpg");
    ImageIcon grass = new ImageIcon("C:\\Users\\Misha\\Desktop\\grass.jpg");


    public ShapeGUI() {
        super("CreateShape");
        setVisible(true);
        setSize(ShapeGUI.WIDTH, ShapeGUI.HEIGTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initListerAction();
        panel = mainScreen();
        add(panel);
    }


    public JPanel mainScreen() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 3, 100, 500));
        jPanel.add(createCircle);
        jPanel.add(createTriangle);
        jPanel.add(createRectangle);
        jPanel.add(walkWithDog);
        return jPanel;
    }

    public JPanel circleScreen() {
        JPanel jPanel = new JPanel();
        jPanel.add(back);
        textField.setColumns(80);
        jPanel.add(textField);
        jPanel.add(calculatePerimeterCircle);
        jPanel.add(calculateSquareCircle);
        return jPanel;
    }

    public JPanel triangleScreen() {
        JPanel jPanel = new JPanel();
        jPanel.add(back);
        side1.setColumns(10);
        side2.setColumns(10);
        side3.setColumns(10);
        jPanel.add(side1);
        jPanel.add(side2);
        jPanel.add(side3);
        jPanel.add(calculatePerimeterTriangle);
        jPanel.add(calculateSquareTriangle);
        return jPanel;
    }

    public JPanel walkWithDogScreen(int capacity){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 5, 100, 500));


        JLabel jLabel = new JLabel(imageIcon);
        jPanel.add(left);
        jPanel.add(jLabel);

        jLabelsArray = new JLabel[capacity];
        for(int i = 0; i < jLabelsArray.length; i++){
            if(i == 0 ){
                jLabelsArray[i] = jLabel;
            }else{
                jLabelsArray[i] = new JLabel(grass);
            }
            jPanel.add(jLabelsArray[i]);
        }
        jPanel.add(rigth);
        return jPanel;
    }

    private void initListerAction() {
        createCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel = circleScreen();
                panel.setVisible(true);
                add(panel);
                System.out.println("Button Pressed");
            }
        });
        createTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel = triangleScreen();
                panel.setVisible(true);
                add(panel);
                System.out.println("Button Pressed");
            }
        });
        calculatePerimeterCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int x = Integer.parseInt(textField.getText());
                    circle = new Circle(x);
                    result.setText("Perimeter = " + circle.getPerimeter());
                    panel.add(result);
                    System.out.println("Button Pressed");
                    setVisible(true);

                } catch (NumberFormatException ex) {
                    System.out.println("Enter normal Number of radius");
                }
            }
        });
        calculateSquareCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int x = Integer.parseInt(textField.getText());
                    circle = new Circle(x);
                    result.setText("Perimeter = " + circle.getSquare());
                    panel.add(result);
                    System.out.println("Button Pressed");
                    setVisible(true);

                } catch (NumberFormatException ex) {
                    System.out.println("Enter normal Number of radius");
                }
            }
        });

        calculatePerimeterTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(side1.getText());
                    int b = Integer.parseInt(side2.getText());
                    int c = Integer.parseInt(side3.getText());
                    triangle = new Triangle(a, b, c);
                    result.setText("Perimeter = " + triangle.getPerimeter());
                    panel.add(result);
                    setVisible(true);

                } catch (NumberFormatException ex) {
                    System.out.println("enter correct sides");
                }
            }
        });

        calculateSquareTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(side1.getText());
                    int b = Integer.parseInt(side2.getText());
                    int c = Integer.parseInt(side3.getText());
                    triangle = new Triangle(a, b, c);
                    result.setText("Square = " + triangle.getSquare());
                    panel.add(result);
                    setVisible(true);

                } catch (NumberFormatException ex) {
                    System.out.println("enter correct sides");
                }
            }
        });


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel = mainScreen();
                panel.setVisible(true);
                add(panel);
            }
        });

        walkWithDog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel = walkWithDogScreen(8);
                panel.setVisible(true);
                add(panel);
            }
        });
        rigth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelsArray[currentPositionOfDog++].setIcon(grass);
                jLabelsArray[currentPositionOfDog].setIcon(imageIcon);
            }
        });

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelsArray[currentPositionOfDog--].setIcon(grass);
                jLabelsArray[currentPositionOfDog].setIcon(imageIcon);
            }
        });

    }
}
