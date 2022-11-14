package ch06;

public class Ex16_Main {

	public static void main(String[] args) {
		int[] intArray = {5,10,8,4,50,6,88,9,111,23};
		
		//생성자에 대입한것
		Ex16_MyArray myArray = new Ex16_MyArray(intArray);
		
		//메소드 호출
		System.out.println("평균 " + myArray.getAvg());
		System.out.println("최대값  " + myArray.getMax());
		System.out.println("최소값 " + myArray.getMin());
		System.out.println("합의 제곱 " + myArray.getSumofSquare());
		myArray.printArray();
		
		
		
	
	}

}
