public class test {
    public static void main(String[] args) {
        int array2d[][] = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 0, 12},
                {8, 8, 9, 10, 11, 12},
                {7, 8, 3, 10, 11, 12},
                {88, 66, 92, 102, 151, 999}
        };
        App a=new App();
        /*三个参数
         * 1.数组
         * 2.要找的数的行
         * 3.要找的数的列
         * */
        a.zore(array2d,151);
        /*上*/
        a.zore_up(array2d,151);
        /*下*/
        a.zore_dnow(array2d,151);
        /*左*/
        a.zore_left(array2d,151);
        /*右*/
        a.zore_rigth(array2d,151);
    }

}
