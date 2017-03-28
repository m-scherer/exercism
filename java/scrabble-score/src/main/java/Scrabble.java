import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private String word;
    private Map scoreLookup;

    public Scrabble(String input){
        this.word = cleanWord(input);
        this.scoreLookup = this.createScores();
    }

    public int getScore() {
        Integer score = 0;

        for (int i = this.word.length() - 1; i >=0; i--) {
            Integer found = (Integer) this.scoreLookup.get(this.word.charAt(i));
            score += found;
        }
        return score;
    }

    private String cleanWord(String word) {
        String cleanWord;

        if (word == null) {
            cleanWord = "";
        } else {
            cleanWord = word.toLowerCase().replaceAll("\\W","");
        }

        return cleanWord;
    }

    private Map createScores() {
        Map<Character, Integer> scores = new HashMap<>();
        scores.put('a', 1);
        scores.put('e', 1);
        scores.put('i', 1);
        scores.put('o', 1);
        scores.put('u', 1);
        scores.put('f', 4);
        scores.put('s', 1);
        scores.put('r', 1);
        scores.put('t', 1);
        scores.put('q', 10);
        scores.put('k', 5);
        scores.put('y', 4);
        scores.put('x', 8);
        scores.put('p', 3);
        scores.put('h', 4);
        scores.put('n', 1);
        scores.put('b', 3);
        scores.put('z', 10);
        scores.put('l', 1);
        scores.put('c', 3);
        scores.put('r', 1);

        return scores;
    }
}