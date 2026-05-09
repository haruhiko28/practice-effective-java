package item05;

import java.util.List;
import java.util.Objects;

public class SpellChecker03 {
    private final Lexicon dictionary;    

    public SpellChecker03(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {return true;}
    public List<String> suggestions(String typo) {return List.of();}
}

// Mosaic create(Supplier<? extends Tile> tileFactory){....}