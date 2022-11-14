package ch06;
/**
 *  연습으로 만들어본 버전
 *  강사님께아니라 결과는 나오는데 틀린방식이 다수있음
 */

import java.util.Arrays;

public class Ex16_MyArray {

	// 인스턴트 필드 생성
	int[] elementPerLine;
	
	// 생성자
	Ex16_MyArray(int[] elementPerLine) { 
		this.elementPerLine = elementPerLine;
	}

	// 인스턴스 메소드 생성
	double getAvg() {
		int sum = 0;
		for (int element : this.elementPerLine) {
			sum += element;
		}
		return (double) sum / elementPerLine.length;
	}

	int getMin() {
		int min = this.elementPerLine[0];
		for (int element : this.elementPerLine) {
			min = (min > element) ? element : min;
		}
		return min;
	}

	int getMax() {
		int max = this.elementPerLine[0];
		for (int element : this.elementPerLine) {
			max = (max < element) ? element : max;
		}
		return max;
	}


	int getSumofSquare() {
		int sum = 0;
		for (int element : this.elementPerLine) {
			sum += element;
		}
		return sum*sum;
	}
	
	void printArray() {
		System.out.println(Arrays.toString(this.elementPerLine));
	}
}
