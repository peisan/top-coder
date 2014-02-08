import java.util.*;

public class FauxPalindromes {
    public String classifyIt(String word) {

        // Palindrome
        if (isPalindromes(word)) {
            return "PALINDROME";
        }

        //Faux Palindromes
        String faux = faux(word);
        if (isPalindromes(faux)) {
            return "FAUX";
        }

        return "NOT EVEN FAUX";
    }

    private boolean isPalindromes(String word) {
        StringBuffer wordBuffer = new StringBuffer(word);
        if (wordBuffer.length() > 1) {
            if (wordBuffer.charAt(0) == wordBuffer.charAt(wordBuffer.length() - 1)) {
                wordBuffer.deleteCharAt(0);
                wordBuffer.deleteCharAt(wordBuffer.length() - 1);
            } else {
                return false;
            }
            return isPalindromes(wordBuffer.toString());
        }
        return true;
    }

    private String faux(String word) {
        StringBuffer wordBuffer = new StringBuffer(word);
        String result = "";
        char prev = ' ';
        for (int i = 0; i < wordBuffer.length(); i++) {
            if (prev != wordBuffer.charAt(i)) {
                result = result + wordBuffer.charAt(i);
            }
            prev = wordBuffer.charAt(i);
        }
        return result;
    }
}
