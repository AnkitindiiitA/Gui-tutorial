import  javax.swing.*;
import java.awt.*;

public class FlowLayout06 {
    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for component within a container

        // FlowLayout = places component in a row , size at their preferred size
        //              if the horizontal space in the container is too small
        //              the FlowLayout class uses the next available row.


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        //frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel= new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn4.setFocusable(false);
        btn5.setFocusable(false);
        btn6.setFocusable(false);
        btn7.setFocusable(false);
        btn8.setFocusable(false);
        btn9.setFocusable(false);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);


        frame.add(panel);
        frame.setVisible(true);
    }
}
