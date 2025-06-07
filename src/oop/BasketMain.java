package oop;

class Player1 {
    protected String name;
    protected String position;

    public Player1(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String shoot() {
        String message = position + " " + name + ": 기본 슛";
        System.out.println(message);
        return message;
    }
}
class Sg1 extends Player1 {
    public Sg1(String name) {
        super(name, "슈팅 가드");
    }
    @Override
    public String shoot() {
        String message = position + " " + name + ": 3점슛! ";
        System.out.println(message);
        return message;
    }
}

class Pg1 extends Player1 {
    public Pg1(String name) {
        super(name, "포인트 가드");
    }

    @Override
    public String shoot() {
        String message = position + " " + name + ": 돌파 후 점퍼!";
        System.out.println(message);
        return message;

    }
}

class Center extends Player1 {
    public Center(String name) {
        super(name, "센터");
    }

    @Override
    public String shoot() {
        String message = position + " " + name + ": 골밑슛!";
        System.out.println(message);
        return message;
    }
}
class Pf extends Player1 {
    public Pf(String name) {
        super(name, "파워 포워드");
    }

    @Override
    public String shoot() {
        String message = position + " " + name + ": 미들슛!";
        System.out.println(message);
        return message;
    }
}

class Sf extends Player1 {
    public Sf(String name) {
        super(name, "스몰 포워드");
    }
    @Override
    public String shoot() {
        String message = position + " " + name + ": 슬래시 앤 드라이브!";
        System.out.println(message);
        return message;
    }
}
public class BasketMain {
    public static void main(String[] args) {
        Player1[] team = {
                new Pg1("민수"),
                new Sg1("준호"),
                new Sf("지훈"),
                new Pf("영철"),
                new Center("성민"),
        };

        System.out.println("[팀 슛 연습 시작!]\n");

        for (Player1 p : team) {
            p.shoot(); //오버라이딩된 shoot() 실행 (동적 바인딩)
        }
    }
}

