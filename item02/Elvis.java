package item02;

// public class Elvis {
//     public static final Elvis INSTANCE = new Elvis();
//     private Elvis() {}

//     public void leaveTheBuilding() {}
// }

// public class Elvis {
//     private static final Elvis INSTANCE = new Elvis();
//     private Elvis() {}
//     public static Elvis getInstance() {return INSTANCE;}

//     public void leaveTheBuilding() {}

//     private Object readResolve() {
//         return INSTANCE;
//     }
// }

public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {}
}
