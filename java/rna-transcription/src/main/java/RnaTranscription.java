import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RnaTranscription {

    public String ofDna(String dnaString) {
        HashMap<String, String> rna = new HashMap<>();
        rna.put("G", "C");
        rna.put("C", "G");
        rna.put("T", "A");
        rna.put("A", "U");
        rna.put("", "");

        String[] letters = dnaString.split("");
        List<String> splitString = Arrays.asList(letters);

        System.out.println(rna);
        System.out.println(splitString);

        ArrayList<String> convertedStrands = new ArrayList<>();
        for (String letter : splitString ) {
            convertedStrands.add( rna.get(letter) );
        }

        StringBuilder newString = new StringBuilder();
        for (String convertedLetter : convertedStrands) {
            newString.append(convertedLetter);
        }
        String output = newString.toString();

        return output;
    }
}
