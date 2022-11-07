import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage09 implements ActionListener {

    JFrame frame = new JFrame();
    JButton mybutton = new JButton("New Window");

    LaunchPage09(){

        mybutton.setBounds(100,160,200,40);
        mybutton.setFocusable(false);
        mybutton.addActionListener(this);

        frame.add(mybutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==mybutton){
            frame.dispose();//prevents from multiple new windows when clicked on new window button and disposes the main page
            newWindow09 myWindow = new newWindow09();
        }
    }
}
