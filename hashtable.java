public class hashtable<K, V> {
	private class HTPair {
		K key;
		V value;

		HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public boolean equals(Object other) {
			HTPair op = (HTPair) other;
			return this.key.equals(op.key);
		}

		public String toString() {
			return "{" + this.key + "-" + this.value + "}";
		}
	}

	public static final int DEFAULT_CAPACITY = 10;

	private LinkedListgeneric<HTPair>[] bucketArray;
	private int size;

	public hashtable() {
		this(DEFAULT_CAPACITY);
	}

	public hashtable(int capacity) {
		this.bucketArray = (LinkedListgeneric<HTPair>[]) new LinkedListgeneric[capacity];
		this.size = 0;

	}

	public void put(K key, V value) throws Exception {
		int bi = hashfunction(key);
		LinkedListgeneric<HTPair> bucket = this.bucketArray[bi];
		HTPair pta = new HTPair(key, value);
		if (bucket == null) {
			bucket = new LinkedListgeneric<>();
			bucket.addLast(pta);
			this.bucketArray[bi] = bucket;
			this.size++;
		} else {
			int findAt = bucket.find(pta);
			if (findAt == -1) {
				bucket.addLast(pta);
				this.size++;
			} else {
				HTPair pair = bucket.getAt(findAt);
				pair.value = value;
			}

		}
	}

	public V get(K key) throws Exception {
		int bi = hashfunction(key);
		LinkedListgeneric<HTPair> bucket = this.bucketArray[bi];
		HTPair ptf = new HTPair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int findAt = bucket.find(ptf);
			if (findAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(findAt);
				return pair.value;
			}
		}

	}

	private int hashfunction(K key) {
		int hc = key.hashCode();
		hc = Math.abs(hc);
		int bi = hc % bucketArray.length;
		return bi;
	}

	public void display() {
		for (LinkedListgeneric<HTPair> bucket : this.bucketArray) {
			if (bucket != null && !bucket.isEmpty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
			}
		}
		System.out.println("*************************************************");
	}
	
	
	public  V remove(K key) throws Exception
	{
		int bi = hashfunction(key);
		LinkedListgeneric<HTPair> bucket = this.bucketArray[bi];
		HTPair ptf = new HTPair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int findAt = bucket.find(ptf);
			if (findAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(findAt);
				bucket.removeAt(findAt);
				this.size--;
				return pair.value;
			}
		}

		
		
	}

}
