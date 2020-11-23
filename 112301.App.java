
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("请输入【1】获取坐标，输入【2】结束进程");
        Scanner sca=new Scanner(System.in);
        while (true){
            int num=sca.nextInt();
            int x=(int)(Math.random()*100);
            int y=(int)(Math.random()*100);
            if (num == 1){
                System.out.println(("R(x,y)："+x+","+y));
            }else if (num==2){
                System.out.println("结束");
                break;
            }else{
                System.out.println("请输入【1】或【2】");
            }
        }
    }
}
