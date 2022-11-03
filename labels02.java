import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class labels02 {
    public static void main(String[] args) {
      //labels02
        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image=new ImageIcon("C:\\Users\\ANKIT SHARMA\\IdeaProjects\\helloworld\\src\\autobot.png");
        Border border=BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label=new JLabel();//create a label
        label.setText("Bro, Do you even code? ");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center, right of image icon
        label.setVerticalTextPosition(JLabel.TOP);//set text top,center,bottom of the image icon
        label.setForeground(Color.GREEN);//set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font text
        label.setIconTextGap(10);//set gap of text to image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon + text within label
        label.setBounds(100,0,250,250);//set x, y position within frame as well as dimensions
      //labels02


        //frame01

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        //frame.pack();

        //frame01

        frame.add(label);

    }
}
