package quetion1;

public class ArrayDemo {
	int[] manipulateIntegerArray (int arr[]) {
		int newArr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			//newArr[i]=arr[i]+5; 
			arr[i]+=5;
		}
		//return newArr;
		return arr;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		ArrayDemo arrayDemoObj = new ArrayDemo();
		int newArr[] = arrayDemoObj.manipulateIntegerArray(arr);
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
	}

}
