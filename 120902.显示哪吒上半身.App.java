import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    int array2d[][]={
            {1,2,3},
            {4,5,6}
    };
    int cnt=0;
    int cell=128;
    //构造方法
    public test() {
        for (int i = 0; i <=5; i++) {
            label_list.add(new JLabel());
            java.net.URL imgURL = test.class.getResource("img/nezha_"+String.valueOf(i)+".png");
            label_list.get(i).setIcon(new ImageIcon(imgURL));
        }
//          双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                label_list.get(cnt).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(cnt));
                cnt++;
            }
        }



    }
    //显示窗体方法
    void go(){
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new test().go();
    }
}
