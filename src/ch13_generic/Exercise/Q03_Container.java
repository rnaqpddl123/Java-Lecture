package ch13_generic.Exercise;

public class Q03_Container<T, K> {
	private T name;
	private K job;

	public T getKey() {
		return name;
	}

	public K getValue() {
		return job;
	}

	public void set(T name, K job) {
		this.name = name;
		this.job = job;
	}

}
