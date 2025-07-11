package oop;

interface MainOperator {
    int operate(int a, int b);
}

class CalcAdd implements MainOperator {
    public int operate(int a, int b) {
        return a + b;
    }
}

class CalMul implements MainOperator {
    public int operate(int a, int b) {
        return a * b;
    }
}



class computer {
    static void doSomething(int x, int y, MainOperator operator) {
        System.out.println(operator.operate(x, y));
    }
}


public class MainClass {
    public static void main(String[] args) {

        computer.doSomething(1, 2, new CalcAdd());
        computer.doSomething(2, 1, new CalMul());

    }
}
