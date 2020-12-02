import javafx.scene.control.Cell;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_goodPlane=new JLabel();

    int CELL=64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == e.VK_UP) {
                    label_goodPlane.setBounds(label_goodPlane.getX(), label_goodPlane.getY() - CELL, CELL, CELL);
                }if (e.getKeyCode()==e.VK_DOWN){
                    label_goodPlane.setBounds(label_goodPlane.getX(),label_goodPlane.getY()+CELL,CELL,CELL);
                }if (e.getKeyCode()==e.VK_LEFT){
                    label_goodPlane.setBounds(label_goodPlane.getX()-CELL,label_goodPlane.getY(),CELL,CELL);
                }if (e.getKeyCode()==e.VK_RIGHT){
                    label_goodPlane.setBounds(label_goodPlane.getX()+CELL,label_goodPlane.getY(),CELL,CELL);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        myPanel.setLayout(null);
        JFrame frame = new JFrame("飞机");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        java.net.URL imgURL = App.class.getResource("img/plane3.png");
        label_goodPlane.setIcon(new ImageIcon(imgURL));
        label_goodPlane.setBounds(200,590,128,128);
        java.net.URL imgURL2 = App.class.getResource("img/background.png");
        label_txt.setIcon(new ImageIcon(imgURL2));
        label_txt.setBounds(0,0,512,720);
        myPanel.add(label_goodPlane);
        myPanel.add(label_txt);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
