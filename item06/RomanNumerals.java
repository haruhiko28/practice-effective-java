package item06;

import java.util.regex.Pattern;

// Reusing expensive object for improved performance
public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD]|D?C{0,3})"
        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    // Hideously slow! Can you spot the object creation?
    private static long sum() {
        Long sum = 0L; // here
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += 1;
        return sum;
    }
}

