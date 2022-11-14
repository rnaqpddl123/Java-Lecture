package ch06;
/**
 * Ex16_MyArray 강사님 버전
 */

public class EX17_MyArray {
	//필드
	private int numPerLine;

	
	//
	public EX17_MyArray(int numPerLine) {
		super();
		this.numPerLine = numPerLine;
	}

	public int getNumPerLine() {
		return numPerLine;
	}

	public void setNumPerLine(int numPerLine) {
		this.numPerLine = numPerLine;		
	}
	
	//메소드
	double getAvg(int[] arr) {
		int sum=0;
		for (int element : arr) {
			sum += element;
		}	
		
		return (double)sum/arr.length;
	}
	
	int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr) {
			if (min > element)
				min = element;
			
		}
		return min;
	}
	
	int getMax(int[] arr) {
		int max = arr[0];
		for (int element : arr) {
			if (max > element)
				max = element;
		}
		return max;
	}
	
	void printArray(int[] arr) {		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d ", arr[i]);
			if ((i + 1) % numPerLine == 0 || (i+1)==arr.length) 
				System.out.println();	
		}	
	}
	
	int getSumofSquare(int[] arr) {
		int sos=0;
		for (int a : arr) {
			sos += a*a;
		}
		return sos;
	}


}
