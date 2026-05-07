package item05;

import java.util.List;

// Inappropriate use of singleton - inflexible & unstestable! 
public class SpellChecker02 {
    private final Lexicon dictionary = new Lexicon();

    private SpellChecker02() {}
    public static SpellChecker02 INSTANCE = new SpellChecker02();

    public boolean isValid(String word) {return true;}
    public List<String> suggestions(String typo) {return List.of();}   
}

class Lexicon {
}