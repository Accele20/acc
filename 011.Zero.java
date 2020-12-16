public class Zero {
    void goLeft(int array2d[][]){
//        遍历开始
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                if(array2d[row][column]==0){
//                    0在左边界
                    if(column==0){


                    }
//                   非左边界
                    else{
                        int c=array2d[row][column];
                        array2d[row][column]=array2d[row][column-1];
                        array2d[row][column-1]=c;
                        break;
                    }

                }
            }
        }
//        遍历结束

    }
    void goRight(int array2d[][]){//跳格
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                if(array2d[row][column]==0){
                    if(column==array2d[0].length-1){ }else {
                        int c=0;
                        c=array2d[row][column+1];
                        array2d[row][column]=c;
                        array2d[row][column+1]=0;
                        break;
                    }
                }
            }
        }

    }
    void goUp(int array2d[][]){
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                if(array2d[row][column]==0){
                    if(row==0){ }else {
                        int c=array2d[row][column];
                        array2d[row][column]=array2d[row-1][column];
                        array2d[row-1][column]=c;
                        break;
                    }
                }
            }
        }
    }
    void goDown(int array2d[][]){//跳格
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                if(array2d[row][column]==0){
                    if(row==array2d.length-1){ } else {
                        int c=array2d[row][column];
                        array2d[row][column]=array2d[row+1][column];
                        array2d[row+1][column]=c;
                        break;
                    }
                }
            }
        }
    }
}
