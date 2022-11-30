package ua.lesson17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    JButton button1 = new JButton("#1");
    JTextField field = new JTextField();
    public MyWindow(){
        super("MyWindow v1.0");
        setVisible(true);
        setSize(500,300);
        //setResizable(false);
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Hello");
        JLabel label2 = new JLabel("Hello AGAIN");
        panel.setLayout(new GridLayout(2,3,5,10));
        JButton button2 = new JButton("#2");
        JButton button3 = new JButton("#3");
        JButton button4 = new JButton("#4");
        JButton button5 = new JButton("#5");
        JButton button6 = new JButton("#6");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(field);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initListeners();
    }

    private void initListeners() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userText = field.getText();
                System.out.println("Button was pressed: " + userText);
            }
        });
    }
}
