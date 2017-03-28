import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class RnaTranscription {

    private Map<String, String> rna() {
        Map<String, String> rna = new HashMap<>();
        rna.put("G", "C");
        rna.put("C", "G");
        rna.put("T", "A");
        rna.put("A", "U");
        rna.put("", "");

        return rna;
    }

    public String ofDna(String dnaString) {
        String[] letters = dnaString.split("");

        StringBuilder newString = new StringBuilder();
        for (Object convertedLetter : convertStrands(letters)) {
            newString.append(convertedLetter);
        }
        String output = newString.toString();

        return output;
    }

    public ArrayList convertStrands(String[] letters) {
        List<String> splitString = Arrays.asList(letters);

        ArrayList<String> convertedStrands = new ArrayList<>();
        for (String letter : splitString ) {
            convertedStrands.add( rna().get(letter) );
        }
        return convertedStrands;
    }

}