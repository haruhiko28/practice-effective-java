package item05;

import java.util.List;

// Inappropriate use of static utility - inflexible & untestable!
public class SpellChecker {
    private static final Lexicon dictionary =  new Lexicon();

    private SpellChecker() {} // Noninstantiable

    public static boolean isValid(String word) {return true;}
    public static List<String> suggestions(String typo) {return List.of();}
}

class Lexicon {
}