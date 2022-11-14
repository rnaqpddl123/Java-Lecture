package ch11.sec03_Object;

public class Key {
	public int number;

	Key(int number) {
		super();
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return number;			// Objects.hashCode(number);	--> 나중에는 이걸씀
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (number == compareKey.number)
				return true;
		}
		return false;
	}
	
}
