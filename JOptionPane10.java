import javax.swing.*;

public class JOptionPane10 {
    public static void main(String[] args) {

        //JOptionPane = pop up a standard dialogue box that prompts user from a value
        //              or informs them of something

        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is more useless info :D","title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"really?","title",JOptionPane.QUESTION_MESSAGE);
        //while(true) {
            //JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
        //
        //JOptionPane.showMessageDialog(null,"Call tech support NOW OR ELSE!!!!","title",JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(JOptionPane.showConfirmDialog(null,"bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION));
        //int ans = JOptionPane.showConfirmDialog(null,"bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);

        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("hello "+name);

        String[] responses = {"No, You're awesome!","thank you!","blush*"};

        ImageIcon icon =new ImageIcon("smile.png");

        //JOptionPane.showOptionDialog(null,"You are awesome!","secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,0);
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE
                ,icon
                ,responses
                ,1);

    }
}
