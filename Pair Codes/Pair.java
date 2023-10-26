/**
 * Generic pair class
 */
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Pair<?, ?>) {
            Pair<?, ?> pair = (Pair<?, ?>) obj;

            if ((pair.key == this.key) && (pair.value == this.value)) {
                return true;
            }

            if (pair == null || this == null) {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "["+ this.key + ", " + this.value + "]";
    }
}