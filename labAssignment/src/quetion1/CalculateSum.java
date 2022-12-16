package quetion1;

public class CalculateSum {
	static int Sum(int N) {
		int s1,s2,s3;
		s1 =((N/3))*(2*3+(N/3-1)*3)/2;
		s2 =((N/5))*(2*5+(N/5-1)*5)/2;
		s3 =((N/15))*(2*15+(N/15-1)*15)/2;
		return s1+s2-s3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		System.out.print(Sum(N));
	}

}
