import java.util.HashMap;
import java.util.Map;

public class RaindropConverter {
    private Map<Integer, String> testNumbers = new HashMap<>();

    public RaindropConverter() {
        this.generateNumbers();
    }

    public String convert(int number) {
        StringBuilder raindrops = new StringBuilder("");

        for (Integer key : testNumbers.keySet()) {
            if (number % key == 0) {
                raindrops.append( testNumbers.get(key) );
            }
        }

        return this.checkString(raindrops.toString(), number);
    }

    private void generateNumbers() {
        testNumbers.put(3, "Pling");
        testNumbers.put(5, "Plang");
        testNumbers.put(7, "Plong");
    }

    private String checkString(String raindrops, int number) {
            String sounds;

            if (raindrops.isEmpty()) {
                sounds = Integer.toString(number);
            } else {
                sounds = raindrops;
            }

        return sounds;
    }

}