import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App2 {
    private JPanel myPanel=new JPanel();
    private JLabel label_mous=new JLabel();
    JLabel label_back=new JLabel();
    JLabel label_num=new JLabel();
    int x=0;

    public App2() {
        label_mous.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                x++;
                label_mous.setBounds((int)(Math.random()*10%10*50),
                        (int)(Math.random()*10%10*50),60,60);
                label_num.setText(String.valueOf(x));
            }
        });
    }

    public void go(){
        java.net.URL img1=App2.class.getResource("a.gif");
        java.net.URL img2=App2.class.getResource("timg.jpg");
        myPanel.setLayout(null);
        label_mous.setIcon(new ImageIcon(img1));
        label_back.setIcon(new ImageIcon(img2));
        myPanel.add(label_num);
        myPanel.add(label_mous);
        myPanel.add(label_back);
        JFrame frame = new JFrame("打地鼠1.0");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(((Toolkit.getDefaultToolkit().getScreenSize().width)/2)-512,
                ((Toolkit.getDefaultToolkit().getScreenSize().height)/2)-384,
                1024,768);
        label_num.setFont(new Font("宋体",Font.BOLD,30));
        label_num.setForeground(Color.red);
        frame.setVisible(true);
        label_back.setBounds(0,0,1024,768);
        label_mous.setBounds(0,0,60,60);
        label_num.setBounds(10 ,10,50,50);

    }

    public static void main(String[] args) {
        new App2().go();
    }
}
