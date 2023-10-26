class test {
    public static void main(String[] args) {
        // Testing generic pair class
        Pair<Integer, Integer> p1 = new Pair<Integer,Integer>(1, 0);
        Pair<Integer, Integer> p2 = new Pair<Integer,Integer>(1, 0);
        Pair<Integer, String> p3 = new Pair<Integer, String>(1, "test string");
                
        System.out.println(p1.toString());  // Print pair
        System.out.println(p2.equals(p3));

        // Testing IntegerPair class
        IntegerPair p4 = new IntegerPair(2, 2);
        IntegerPair p5 = new IntegerPair(2, 2);

        System.out.println(p4.compareTo(p5) < 0 ? false : true);

        // Testing IntegerTriple class
        IntegerTriple p6 = new IntegerTriple(0, 1, 2);
        IntegerTriple p7 = new IntegerTriple(0, 1, 3);
        
        System.out.println(p6.compareTo(p7) < 0 ? false : true);

        // Testing IntegerQuad class
        IntegerQuad p8 = new IntegerQuad(0, 1, 2, 3);
        IntegerQuad p9 = new IntegerQuad(0, 1, 2, 4);

        System.out.println(p8.compareTo(p9) < 0 ? false : true);
    }
}
