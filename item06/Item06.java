package item06;

public class Item06 {
    String s1 = new String("bikini");
    String s2 = "bikini";

    static boolean isRomanNumeral(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
            +"(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
        );
    }
}
