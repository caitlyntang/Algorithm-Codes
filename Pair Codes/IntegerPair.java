/**
 * IntegerPair class used in Graph Adjacency List
 * 
 * Example implementation: Vector<Vector<IntegerPair>> AL;
 */
class IntegerPair implements Comparable<IntegerPair> {
    private Integer f;
    private Integer s;
    
    public IntegerPair(Integer f, Integer s) {
        this.f = f;
        this.s = s;
    }

    public Integer first() {
        return this.f;
    }

    public Integer second() {
        return this.s;
    }

    @Override
    public int compareTo(IntegerPair o) {
        if (!this.first().equals(o.first()))    // this.first() != o.first()
            return this.first() - o.first();    // is wrong as we want to
        else                                    // compare their values,
            return this.second() - o.second();  // not their references
    }
}