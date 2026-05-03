package item04;

// Non instantiable utility class
public class Utility {
    // Suppress default constructor fdor noninstantibility
    private Utility() {
        throw new AssertionError();
    }
    // Remainder omitted
}
