public class Hamming {
    private String first;
    private String second;

    public Hamming(String firstStrand, String secondStrand) {
        first = firstStrand;
        second = secondStrand;
        checkLength();
    }

    public int getHammingDistance() {
        int counter = 0;

        for (int i = first.length() - 1; i >= 0; i--) {
            if (first.charAt(i) != second.charAt(i)) {
                counter += 1;
            }
        }
        return counter;
    }

    private void checkLength() {
        if (first.length() != second.length()) {
            throw new IllegalArgumentException();
        }
    }

}
