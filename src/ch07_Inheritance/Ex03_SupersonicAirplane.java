package ch07_Inheritance;

public class Ex03_SupersonicAirplane extends Ex03_Airplane{
	// NORMAL-1, SUPERSONIC - 2
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC)
			System.out.println("초음속으로 비행합니다.");
		else
			super.fly();
	}
	

}
