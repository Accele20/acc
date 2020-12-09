public class App {
    void zore(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                        System.out.println("x:"+(i+1)+"y:"+(j+1));

                }
            }
        }
    }
    void zore_up(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    if (i+1>=7 || j>=6){
                        System.out.println("x:"+0+"y:"+0);
                    }else {
                        System.out.println("x:" + (i + 1) + "y:" + (j));
                    }
                }
            }
        }
    }
    void zore_dnow(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    if (i+1>=7 || j+2>=6){
                        System.out.println("x:"+0+"y:"+0);
                    }else {
                        System.out.println("x:" + (i + 1) + "y:" + (j + 2));
                    }
                }
            }
        }
    }
    void zore_left(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    if (i>=7 || j+1>=6){
                        System.out.println("x:"+0+"y:"+0);
                    }else {
                        System.out.println("x:" + (i) + "y:" + (j + 1));
                    }
                }
            }
        }
    }
    void zore_rigth(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    if (i+2>=7 || j+1>=6){
                        System.out.println("x:"+0+"y:"+0);
                    }else {
                        System.out.println("x:" + (i + 2) + "y:" + (j + 1));
                    }
                }
            }
        }
    }
}
