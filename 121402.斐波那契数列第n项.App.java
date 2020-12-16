import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int[] a=new int[40];
		for(int i=0;i<40;i++) {
			
			if(i<2){
				if(i==0) {
					a[i]=0;
				}else {
					a[i]=1;
				}
			}else {
				a[i]=a[i-1]+a[i-2];
			}
		}
		for(int i=0;i<40;i++) {
			
			System.out.print(a[i]+"      ");
		}
		System.out.print(a[s.nextInt()-1]);
	}
}
