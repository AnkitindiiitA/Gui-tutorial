import javax.swing.*;
import java.awt.*;

public class panels03 {
    public static void main(String[] args) {
        //JPanel = a GUI component that functions as a container to hold other components

        //JLabel02

        ImageIcon image=new ImageIcon("thumbsup.png");

        JLabel label=new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,75,75);

        //JLabel02

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        //redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);


        //frame01

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);

        //redPanel.add(label);
        greenPanel.add(label);
        //bluePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        //frame01

    }
}
