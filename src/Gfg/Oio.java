package Gfg;

public class Oio {
public static void oi(int n) {
int i, j;
for(i=1;i<n;i++) {
	for(j=1;j<=i;j++) {

		if((i+j)%2 ==0){
			
		System.out.print(1 +" ");
	}
		else {
			System.out.print(0 +" ");
		}
	}
	System.out.println();
}
}
public static void main(String[] args) {
	int n=6;
	oi(n);
}
}
