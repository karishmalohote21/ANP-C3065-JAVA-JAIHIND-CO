package quetion3;

public class Checknumber {
	
	public static void main(String[] args) {
		int number= 543;
		boolean increasingNumber = false;
		increasingNumber = checknumber( number);
		System.out.println(increasingNumber);
	}
		
		public static boolean checknumber(int  number) {
			boolean increasing = false;
			while( number>0) {
				int lastDigit = number % 10;
				 number/=10;
				int nextLastDigit =  number%10;
				if(nextLastDigit <= lastDigit) {
					increasing = true;
				}
				else {
					increasing = false;
					break;
				}
			}
			return increasing;
		}

	}
