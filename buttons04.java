import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class buttons04 implements ActionListener{
    JButton btn;
    JLabel label;

    public buttons04(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,500);
        Container container = frame.getContentPane();
        container.setLayout(null);

        ImageIcon icon2=new ImageIcon("point.png");
        label=new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        ImageIcon icon=new ImageIcon("point.png");

        btn = new JButton("Button one");
        btn.setBounds(150,10,200,40);
        container.add(btn);
        btn.addActionListener(this);
        //btn.setText("I'm a button");
        btn.setFocusable(false);
        btn.setIcon(icon);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.BOTTOM);
        btn.setFont(new Font("Comic sans",Font.BOLD,25));
        btn.setIconTextGap(-15);
        btn.setForeground(Color.CYAN);
        btn.setBackground(Color.lightGray);
        btn.setBorder(BorderFactory.createEtchedBorder());
        //btn.setEnabled(false);

        frame.setVisible(true);
        frame.add(label);
    }

    public static void main(String[] args) {
        buttons04 btnevents = new buttons04();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("poo");
            label.setVisible(true);
            btn.setEnabled(false);
        }
    }
}


