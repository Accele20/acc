import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_score=new JLabel();
    int score,score1;
    //构造方法
    public App() {
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton()==e.BUTTON1){
                    System.out.println(e.getX()+","+e.getY());
                }
            }
        });
        label_txt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (((e.getX()>=537 && e.getX()<=553) && (e.getY()>=336 && e.getY()<=359))){
                    label_score.setText("得分："+score++);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_score.setBounds(50,50,200,50);
        java.net.URL imgURL = App.class.getResource("4.jpg");
        label_txt.setIcon(new ImageIcon(imgURL));
        label_txt.setBounds(0,0,1000,750);
        label_score.setForeground(Color.red);
        label_score.setFont(new Font("宋体",Font.BOLD,20));
        myPanel.add(label_score);
        myPanel.add(label_txt);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1010,780);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}