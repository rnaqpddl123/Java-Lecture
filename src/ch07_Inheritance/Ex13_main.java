package ch07_Inheritance;

public class Ex13_main {

	public static void main(String[] args) {
		Ex13_Driver driver = new Ex13_Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(taxi);
		driver.drive(bus);
		

	}

}
