import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        while (true) {
            Scanner sca = new Scanner(System.in);
            System.out.print("请输入一个年份：");
            int year = sca.nextInt();
            if (year>0) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("是闰年");
                } else {
                    System.out.println("是平年");
                }
            }else if (year<0){
                if (Math.abs(year)%4==1 || Math.abs(year)%400==1){
                    System.out.println("是闰年");
                }else{
                    System.out.println("是平年");
                }
            }else{
                System.out.println("公元没有0年");
            }
        }
    }
}
