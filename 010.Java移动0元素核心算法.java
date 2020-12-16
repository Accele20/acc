import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class a {
    JPanel myPanel=new JPanel();
    List<JLabel> list=new ArrayList();
    JLabel jLabel_fen=new JLabel();
    JFrame frame = new JFrame("哪吒拼图");
    int cell=128;
    int fen=0;
    static int[][] map2d={
            {4,11,3},
            {1,5,6},
            {8,7,9},
            {10,2,0}
    };

    //判断是否赢
    public void win(int array2d[][]){
        int w=0;
        for (int K = 0; K < array2d.length; K++) {
            for (int L = 0; L < array2d[0].length; L++) {
                if(array2d[K][L]==((K*3)+L)+1){
                    w++;
                }
            }
        }
        if(w==11){
            JOptionPane.showMessageDialog(null,"恭喜通关，共使用"+fen+"步数");
            frame.dispose();
        }
    }
    //构造方法
    public a() {
        //添加分数控件
        jLabel_fen.setBounds(0,0,100,100);
        jLabel_fen.setText("步数:"+fen);
        jLabel_fen.setForeground(Color.magenta);
        myPanel.add(jLabel_fen);
        //根据数组添加标签
        for (int row = 0; row < map2d.length; row++) {
            for (int column = 0; column < map2d[0].length; column++) {
                list.add(new JLabel());
                java.net.URL imgURL = a.class.getResource("nezha_"+(map2d[row][column])+".png");
                list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(list.get(row*3+column));
            }
        }

    }
    //显示窗体方法
    void go(){



        /*使用大写WSAD控制方向*/
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode()==KeyEvent.VK_W||e.getKeyCode()==KeyEvent.VK_UP){
                    System.out.printf("上");
                    /*更改数组-上移*/
                    new Zero().goUp(map2d);
                    /*重新添加标签*/
                    for (int row = 0; row < map2d.length; row++) {
                        for (int column = 0; column < map2d[0].length; column++) {
                            list.add(new JLabel());
                            java.net.URL imgURL = a.class.getResource("nezha_"+(map2d[row][column])+".png");
                            list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                            list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                            myPanel.add(list.get(row*3+column));
                        }
                    }
                    win(map2d);
                    fen++;
                    jLabel_fen.setText("步数:"+fen);
                }
                /*按下S(大写)*/
                if(e.getKeyCode()==KeyEvent.VK_S||e.getKeyCode()==KeyEvent.VK_DOWN){
                    System.out.printf("下");
                    /*更改数组-下移*/
                    new Zero().goDown(map2d);
                    /*重新添加标签*/
                    for (int row = 0; row < map2d.length; row++) {
                        for (int column = 0; column < map2d[0].length; column++) {
                            list.add(new JLabel());
                            java.net.URL imgURL = a.class.getResource("nezha_"+(map2d[row][column])+".png");
                            list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                            list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                            myPanel.add(list.get(row*3+column));
                        }
                    }
                    win(map2d);
                    fen++;
                    jLabel_fen.setText("步数:"+fen);
                }
                /*按下A(大写)*/
                if(e.getKeyCode()==KeyEvent.VK_A||e.getKeyCode()==KeyEvent.VK_LEFT){
                    System.out.printf("左");
                    /*更改数组-左移*/
                    new Zero().goLeft(map2d);
                    /*重新添加标签*/
                    for (int row = 0; row < map2d.length; row++) {
                        for (int column = 0; column < map2d[0].length; column++) {
                            list.add(new JLabel());
                            java.net.URL imgURL = a.class.getResource("nezha_"+(map2d[row][column])+".png");
                            list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                            list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                            myPanel.add(list.get(row*3+column));
                        }
                    }
                    win(map2d);
                    fen++;
                    jLabel_fen.setText("步数:"+fen);
                }
                /*按下D(大写)*/
                if(e.getKeyCode()==KeyEvent.VK_D||e.getKeyCode()==KeyEvent.VK_RIGHT){
                    /*更改数组-右移*/
                    new Zero().goRight(map2d);
                    /*重新添加标签*/
                    for (int row = 0; row < map2d.length; row++) {
                        for (int column = 0; column < map2d[0].length; column++) {
                            list.add(new JLabel());
                            java.net.URL imgURL = a.class.getResource("nezha_"+(map2d[row][column])+".png");
                            list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                            list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                            myPanel.add(list.get(row*3+column));
                        }
                    }
                    win(map2d);
                    fen++;
                    jLabel_fen.setText("步数:"+fen);
                }
            }
        });




        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        myPanel.setFocusable(true);
        //frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new a().go();
    }


}
