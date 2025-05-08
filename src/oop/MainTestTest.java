package oop;
interface Car {
    void drive();
}

interface Airplane {
    void drive();
}

interface Pos extends Car, Airplane {
}

class Kin implements Pos {
    @Override
    public void drive() {
        System.out.println("Kin drive");
    }
}

public class MainTestTest {
}
