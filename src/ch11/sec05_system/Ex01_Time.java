
package ch11.sec05_system;

public class Ex01_Time {

	public static void main(String[] args) {
		long milliTime = System.currentTimeMillis();	// 1970-01-01 00:00:00기준(milli초 단위로)
		System.out.println(milliTime);
		
		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i=0; i<=100000; i++)
			sum +=i;
		
		long time2 = System.nanoTime();
		
		System.out.println("1~100000 합" + sum);	// 참고로 값이 너무커셔서 표현할수있는 범위를 넘어가서 값이 이상하게나옴
		System.out.println("소요시간: " + (time2-time1) + "나노초");
	}

}
