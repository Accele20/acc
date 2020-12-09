import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List <JLabel> label_img=new ArrayList<>();
    //构造方法
    public test() {
        label_img.add(new JLabel());
        label_img.add(new JLabel());
        label_img.add(new JLabel());

        java.net.URL imgURL = test.class.getResource("img/ball.png");
        label_img.get(0).setIcon(new ImageIcon(imgURL));
        label_img.get(0).setBounds(0,100,800,500);
        myPanel.add(label_img.get(0));

        label_img.get(1).setIcon(new ImageIcon(imgURL));
        label_img.get(1).setBounds(68,100,800,500);
        myPanel.add(label_img.get(1));

        label_img.get(2).setIcon(new ImageIcon(imgURL));
        label_img.get(2).setBounds(126,100,800,500);
        myPanel.add(label_img.get(2));
    }
    //显示窗体方法
    void go(){
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new test().go();
    }
}
