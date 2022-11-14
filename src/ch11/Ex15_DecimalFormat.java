package ch11;

import java.text.DecimalFormat;

public class Ex15_DecimalFormat {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		// 어느 자리수까지 찍을껀지 (DecimalFormat)
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));		// 1234568 (반올림해줌)
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));		//1234567.9	(반올림해줌)
		df = new DecimalFormat("00000000.0000");		
		System.out.println(df.format(num));		//01234567.8900
		
		df = new DecimalFormat("#");		
		System.out.println(df.format(num));		// 1234568
		
		df = new DecimalFormat("########.####");	//	#으로 하면 자리수 넘어가면 안찍어줌
		System.out.println(df.format(num));			// 1234567.89 
		
		df = new DecimalFormat("#.0");	
		System.out.println(df.format(num));		//1234567.9
		
		df = new DecimalFormat("#,###.00");		// 천단위 구분 기호(,)
		System.out.println(df.format(num));		//1,234,567.89 
		
		df = new DecimalFormat("#.0E0");		
		System.out.println(df.format(num));		//.12E7
		
		df = new DecimalFormat("#,###;(#.###)");		
		System.out.println(df.format(-num));		//(1,234,568)
		
		df = new DecimalFormat("\u00A4 #,###");		
		System.out.println(df.format(num));		//₩ 1,234,568 (원화표시)
		
		
		
		
		
		

	}

}
