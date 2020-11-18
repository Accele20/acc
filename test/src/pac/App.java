package pac;

import javax.swing.*;
import java.awt.*;

public class App {
    private JPanel myPanel;
    private JLabel Label_img;
    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(((Toolkit.getDefaultToolkit().getScreenSize().width)/2)-75,
                ((Toolkit.getDefaultToolkit().getScreenSize().height)/2-75),150,150);
        frame.setVisible(true);
        Label_img.setIcon(new ImageIcon("jkcqw.gif"));
    }

    public static void main(String[] args) {
    new App().go();
    }
}
