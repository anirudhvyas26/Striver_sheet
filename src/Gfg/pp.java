package Gfg;

public class pp {
public static void kk(int n) {
	int i, j;
	int num =1;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++){
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
	}
	
}
public static void main(String[] args) {
	int n=5;
	kk(n);
}
}
