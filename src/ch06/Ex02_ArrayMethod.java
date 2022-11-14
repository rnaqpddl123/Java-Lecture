package ch06;

public class Ex02_ArrayMethod {
	/**
	 * 배열에서 사용하면 좋을 법한 프로그램을 메쏘드로 만들기
	 */
	public static void main(String[] args) {
		int[] intArray = { 43, 24, 46, 89, 3, 24, 90, 101 };
		printArray(intArray);
		int min = getMin(intArray);
		System.out.println("최솟값 : " +min);
		double avg = getAvg(intArray);
		System.out.println("평균값 : "+avg);
		
		
		int[] intArray2 = {3, 59, 37, 87, 100, 34,57, 45,15,25};
		printArray(intArray2);
		int min2 = getMin(intArray);
		System.out.println("최솟값 : " +min2);
		double avg2 = getAvg(intArray2);
		System.out.println("평균값 : "+avg2);
	
			                     
	}
	// 평균값
	static double getAvg(int[] arr) {
		int sum=0;
		for (int element : arr) {
			sum += element;
		}	
		
		return (double)sum/arr.length;
	}
	
	
	//최소값구하는 method
	static int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr) {
			if (min > element)
				min = element;
			
		}
		return min;
	}

	
	//받는 결과값이 없을때(return값이 없을때) void를 붙여줌
	static void printArray(int[] arr) {		//매개변수의 이름은 다른게 일반적, 타입은 반드시 일치
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d ", arr[i]);
			if ((i + 1) % 4 == 0 || (i+1)==arr.length) 
				System.out.println();	
		}	
	}
	

}
