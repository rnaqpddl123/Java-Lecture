package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex02_Equals {

	public static void main(String[] args) {
		int[] src = {4, 8, 2, 9};
		int[] dst = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.equals(src, dst));
		
		int[][] src2d = {{4, 8}, {2, 9}};
		int[][] dst2d =  Arrays.copyOf(src2d, src2d.length);
		System.out.println(Arrays.equals(src2d, dst2d));
		System.out.println(Arrays.deepToString(dst2d));		//true
		//복사한 배열 값을 변경
		dst2d[0][0] =1;
		// Shallowcopy라서 주소가 바뀌지않아서 dst2d가 바뀌면 src2d도 같이바뀜
		System.out.println(Arrays.equals(src2d, dst2d));	//true
		// 값이 둘다 바뀐것을 알수있다.
		System.out.println(Arrays.deepToString(src2d));
		System.out.println(Arrays.deepToString(dst2d));
		
		System.out.println("2차원배열을 각각의 배열마다 복사해주었을때");
		// 2차원 배열, 참조 변수에 대한 배열
		int[][] new2d = Arrays.copyOf(src2d, src2d.length);
		new2d[0] = Arrays.copyOf(src2d[0], src2d[0].length);
		new2d[1] = Arrays.copyOf(src2d[1], src2d[1].length);
		//배열 번지 비교
		System.out.println(Arrays.equals(src2d, new2d));	//false
		// 배열의 값 비교
		System.out.println(Arrays.deepEquals(src2d, new2d)); //true
		
		// 복사한 배열 값을 변경
		new2d[0][0] = 3;
		System.out.println(Arrays.deepEquals(src2d, new2d)); //false
		// 각 배열마다 copyOf한것은 통째로 copyof한것과 다르게 값이 다르다는것을 확인할수있다.
		System.out.println(Arrays.deepToString(src2d));
		System.out.println(Arrays.deepToString(new2d));
		
		
	}

}
