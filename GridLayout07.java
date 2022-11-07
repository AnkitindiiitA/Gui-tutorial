import javax.swing.*;
import java.awt.*;

public class GridLayout07 {
    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for component within a container

        // GridLayout = Places component in a grid of cells
        //              Each component takes all the available space within the cell,
        //              and the cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(new GridLayout());
        //frame.setLayout(new GridLayout(3,3));
        frame.setLayout(new GridLayout(3,3,2,2));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        //with frames by default it uses border layout


        frame.setVisible(true);
    }
}
