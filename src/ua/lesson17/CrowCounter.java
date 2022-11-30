package ua.lesson17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrowCounter extends JFrame {
    int counter = 0;
    JPanel panel = new JPanel();
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Misha\\Desktop\\crow_noun_002_09309.jpg");
    JButton arrival = new JButton("arrival");
    JButton departure = new JButton("departure");
    JLabel label = new JLabel("0");
    JLabel crowPicture = new JLabel(imageIcon);


    public CrowCounter(){
        super("CrowCounter v1.0");
        setVisible(true);

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = getJPanel();
        add(panel);

        initListeners();


    }

    private JPanel getJPanel(){

        panel.setLayout(new GridLayout(1, 3,5,0));
        panel.add(arrival);
        panel.add(departure);
        panel.add(label);
        panel.add(crowPicture);
        return panel;
    }
    private JPanel getSecondScreen(){
        panel.setLayout(new GridLayout(1, 4));
        panel.add(crowPicture);
        return panel;
    }

    private void initListeners() {
        arrival.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                label.setText(String.valueOf(++counter));
                panel.setVisible(false);
            }
        });
        departure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(counter <= 0 )) {
                    label.setText(String.valueOf(--counter));
                }
            }
        });
    }


}
