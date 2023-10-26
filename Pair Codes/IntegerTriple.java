/**
 * IntegerTriple class used in Graphs Edge List
 * 
 * Example implementation: Vector<IntegerTriple> EL;
 */
class IntegerTriple implements Comparable<IntegerTriple> {
    private Integer f;
    private Integer s;
    private Integer t;

    public IntegerTriple(Integer f, Integer s, Integer t) {
        this.f = f;
        this.s = s;
        this.t = t;
    }

    public Integer first() {
        return this.f;
    }

    public Integer second() {
        return this.s;
    }

    public Integer third() {
        return this.t;
    }

    @Override
    public int compareTo(IntegerTriple o) {
        if (!this.first().equals(o.first()))    // this.first() != o.first()
            return this.first() - o.first();    // is wrong as we want to
        else if (!this.second().equals(o.second()))
            return this.second() - o.second();
        else                                    // compare their values,
            return this.third() - o.third();  // not their references
    }
}
