public class RnaTranscription {

    public String ofDna(String dnaString) {
        if(dnaString.length()==0) return "";
        StringBuilder DNA = new StringBuilder(dnaString);

        for (int i = 0; i < DNA.length(); i++)
            switch( DNA.charAt(i) ) {
                case 'C':   DNA.setCharAt(i, 'G');
                            break;
                case 'G':   DNA.setCharAt(i, 'C');
                            break;
                case 'T':   DNA.setCharAt(i, 'A');
                            break;
                case 'A':   DNA.setCharAt(i, 'U');
                            break;
                default:    break;
            }
        return DNA.toString();
    }
}
