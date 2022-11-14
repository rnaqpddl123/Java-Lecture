package ch13_generic.sec06_wildcard;

public class Course<T> {
	private String name;
	private T[] persons; // T타입의 어레이

	public Course(String name, int capacity) {
		this.name = name;
		persons = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}

	public T[] getPerson() {
		return persons;
	}

	public void add(T t) {
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = t;
				return;
			}
		}
	}

}
