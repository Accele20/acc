package ex;

public class App2 implements S{
public static void main(String[] args) {
	System.out.println(S.boy_filePath);
	System.out.println(S.girl_filePath);
	for (int i = 0; i < S.array2d.length; i++) {
		for (int j = 0; j < S.array2d[0].length; j++) {
			System.out.print(S.array2d[i][j]);
		}
	}
}
}
