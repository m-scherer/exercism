import java.util.HashMap;

public class PangramChecker {


    public boolean isPangram(String input) {
        HashMap tracker = buildAlphabet();
        StringBuilder sentence = new StringBuilder(input.replaceAll("(\\W)", "")
                .replaceAll("(\\d)", "")
                .replaceAll("_", ""));

        for (int i = 0; i < sentence.length(); i++) {
            char lowerLetter = Character.toLowerCase( sentence.charAt(i) );
            String letter = Character.toString( lowerLetter );

            int letterCount = (int) tracker.get(letter);

            tracker.put(letter, letterCount + 1);
        }

        return !tracker.containsValue(0);
    }


    public static HashMap buildAlphabet() {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ++ch)
            map.put(String.valueOf(ch), 0);

        return map;
    }
}
