class pra1_1 {
    public static void main(String[] args) {
        Boolean falseman = false;
        System.out.println("false man is " + pra1_1.valueOf(falseman));
    }

    // P5. static factrory method
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    // Advantages
    // 1. Unlike constructors, they hava names.
    // ex. probably name
    //  ・BigInteger(int, int, Random)
    //  ・BigInteger.probablePrime → better
    //
    // 2. Not required to create a new object each time they're invoked
    //   Boolean.valueOf(boolean) method illustarates this technique
    //
    // 3. They can return an object of any subtype of their return type
    //  This gives us great flexibility
    //
    // 4. the class of the returned object can vary from call to call as a function of the input params
    //
    // 5. the class of the returned object need not exist when the class containing the method is written
    //
    // Disadvantages
    // 1. Classes without public or protected constructors cannot be subclassed.
    // 
    // 2. They are hard for programmers to find.
    // 
    // Static factory methods and public constructors both have their uses and it pays to understand their relative merits
}
