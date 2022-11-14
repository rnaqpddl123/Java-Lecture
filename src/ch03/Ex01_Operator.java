package ch03;
/**  (앞에 별을 하나 더 붙이면 주석색깔이 바뀌는데 보통 클래스의 공식적인 설명문때 이와같이표현함
 * 연산자(Operator)
*/
public class Ex01_Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++;
		// \t는 tap기능 \n과%n은 줄바꿈
		System.out.printf("a=%d, \tb=%d\n",a,b);
		
		int c = ++a;
		System.out.printf("a=%d, \tc=%d\n",a,c);		
		
		String s = (a % 2 ==0) ? "짝수" : "홀수";
		System.out.println(a + "은/는" + s);
		
		
		int sum = 0;
		for (int i =0; i<=10; i++) {
			sum +=i;
		}
		System.out.println("sum = " + sum);

		short s1 = 1;
		//short ss = -s1;	//error이 뜸  => 단항 연산자 -를 하면 결과가 int type이되서 type miss match때문에 error	
		short ss = (short)-s1; // 굳이 short타입쓰려면 이런식으로 바꿔줘야함
		
	}

}
