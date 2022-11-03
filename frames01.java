import javax.swing.*;
import java.awt.*;

public class frames01 {
    public static void main(String[] args) {

        //JFrame = a GUI window to add components to

        JFrame frame=new JFrame();//creates an instance of a Frame
        frame.setResizable(false);//prevent frame from resize
        frame.setVisible(true);//make frame visible
        frame.setSize(420,420);//sets the x-dimension ,y-dimension
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminates program on click on cross we can also use (default)HIDE_ON_CLOSE
        //OR DO_NOTHING_ON_CLOSE;
        frame.setTitle("JFrame title goes here");//sets title of frame



        ImageIcon image=new ImageIcon("C:\\Users\\ANKIT SHARMA\\IdeaProjects\\helloworld\\src\\autobot.png");//create an image icon
        frame.setIconImage(image.getImage());//change icon of frame
        //frame.getContentPane().setBackground(Color.GREEN);//change color of background
        frame.getContentPane().setBackground(new Color(123,50,250));
        //frame.getContentPane().setBackground(new Color(0x123456));




    }
}
