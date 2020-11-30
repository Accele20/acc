package ex;

public class App2 implements R{
public static void main(String[] args) {
	System.out.println(R.boy_filePath);
	System.out.println(R.girl_filePath);
	for (int i = 0; i < R.array2d.length; i++) {
		for (int j = 0; j < R.array2d[0].length; j++) {
			System.out.print(R.array2d[i][j]);
		}
	}
}
}
