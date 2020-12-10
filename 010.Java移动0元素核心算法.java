import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    int map[][]={
            {1,3,2},
            {4,7,6},
            {9,8,5},
            {10,11,0}
    };
    int cell=128;
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    new Zero().goUp(map);
                    Imga();
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    new Zero().goDown(map);
                    Imga();
                }
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    new Zero().goRight(map);
                    Imga();
                }
                if (e.getKeyCode()==KeyEvent.VK_LEFT){
                    new Zero().goLeft(map);
                    Imga();
                }
            }
        });
//网格

        //移动矩阵

    }
    void Imga(){
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(map[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
            }
        }
    }
    //显示窗体方法
    void go(){
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        Imga();
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,150,384,530);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);//禁止用户修改大小
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }

}
