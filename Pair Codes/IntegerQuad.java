class IntegerQuad implements Comparable<IntegerQuad> {
    private Integer f;
    private Integer s;
    private Integer t;
    private Integer q;

    public IntegerQuad(Integer f, Integer s, Integer t, Integer q) {
        this.f = f;
        this.s = s;
        this.t = t;
        this.q = q;
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

    public Integer fourth() {
        return this.q;
    }

    @Override
    public int compareTo(IntegerQuad o) {
        if (!this.first().equals(o.first()))
            return this.first() - o.first();
        else if (!this.second().equals(o.second()))
            return this.second() - o.second();
        else if (!this.third().equals(o.third()))
            return this.third() - o.third();
        else
            return this.fourth() - o.fourth();
    }
}
