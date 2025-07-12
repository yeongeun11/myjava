package oop;

interface MainOperator1 {
    void operate(String a);
}

public class MainClass2 {
    public static void main(String[] args) {
        MainOperator1 opAdd = a -> { System.out.print(a); };
        opAdd.operate("add");

        MainOperator1 opSub = a -> {System.out.print(a); };
    }
}

//
//        MainOperator opAdd;
//
//        // Lambda Expression : (a, b) -> a + b;
//
//        opAdd = (a, b) -> a + b;
//
//        MainOperator opMul = (a, b) -> a * b;
//
//        opAdd = (a, b) -> a + b;
//        opMul = (a, b) -> a - b;
//
//        System.out.println(opAdd.add(1, 2));
//        System.out.println(opMul.add(1, 2));
//    }
//
//}
