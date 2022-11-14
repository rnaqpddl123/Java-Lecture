package ch13_generic.Exercise;

public class Q04_OtherPair<K, V> {
	private K key;
	private V value;

	public Q04_OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getvalue() {
		return value;
	}

}
