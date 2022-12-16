package quention4;
import java.util.Scanner;
public class checkNumber {
	
	static boolean ispoweroftwo(int n) {
		if(n==0)
			return false;
		while (n !=1) {
			if (n%2 !=0)
				return false;
			n=n/2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number that u have to check");
		int n = in.nextInt();
		boolean powerOf2 = ispoweroftwo(n);
		System.out.println(powerOf2);
		System.out.print(ispoweroftwo(5));
		
	}

}
