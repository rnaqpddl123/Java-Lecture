package ch11.sec05_system;

import java.util.Properties;
import java.util.Set;

public class Ex02_Property {

	public static void main(String[] args) {
		// System.getProperty --> key값 던져주면 value돌려줌
		String osName = System.getProperty("os.name"); 		
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName + userName + userHome);
		System.out.println();
		
		
		Properties props = System.getProperties();		// hashset같은?
		Set keys = props.keySet();		//set는 집합, 집합의 특징은 종복이 없다는것
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("key: " + key + "value: " + value );
		}
				
		
	}

}
