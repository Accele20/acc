import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App2 {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    TextArea area_a=new TextArea();
    TextArea area_b=new TextArea();
    //构造方法
    public App2() {
        area_a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_ENTER) {
                    if (area_a.getText().equals("汤姆")) {
                        area_b.append("杰瑞\n");
                    } else {
                        area_b.append("派大星\n");
                    }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        myPanel.add(area_a);
        myPanel.add(area_b);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        area_a.setBounds(100,100,200,200);
        area_b.setBounds(100,400,200,200);
        area_a.setBackground(Color.yellow);
        area_b.setBackground(Color.yellow);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App2().go();
    }
}
