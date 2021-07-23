package default11;

import java.io.ByteArrayInputStream;

class Transportation {
    String engine = "engine";

    void move() {
        System.out.println("움직인다");
    }

    void stop() {
        System.out.println("멈춘다.");
    }
}

class Changeable {
    int seat;
    int wheel;
    int rate;

    public Changeable() {
        this(20, 4, 1250);
    }

    public Changeable(int seat, int wheel, int rate) {
        this.seat = seat;
        this.wheel = wheel;
        this.rate = rate;
    }
}

class Bus extends Transportation {
    Changeable change;
    int busStop; //해당 버스가 멈추는 정류장 개수

    public Bus() {
        this(new Changeable(), 10);
    }

    public Bus(Changeable change, int busStop) {
        this.change = change;
        this.busStop = busStop;
    }

    void announce() {
        System.out.println("이번 정류장은 비트캠프,  비트캠프 입니다.");
    }
}

class Express extends Bus {
    public Express() {
        this(1);
    }

    public Express(int busStop) {
        this(new Changeable(29, 4, 30000), 1);
    }

    public Express(Changeable change, int busStop) {
        super(change, busStop);
    }




    void powerDrive() {
        System.out.println("존나 빨리달린다.");
    }

}

class Filght extends Transportation {
    Changeable change;
    int toilet;

    public Filght() {
        this(new Changeable(150, 22, 100000), 2);
    }

    public Filght(Changeable change, int toilet) {
        this.change = change;
        this.toilet = toilet;
    }

    void fly() {
        System.out.println("이륙합니다. 착륙합니다.");
    }
}

class Subway extends Transportation {
    Changeable change;
    int room;

    public Subway() {
        this(new Changeable(100, 100, 12500), 5);
    }

    public Subway(Changeable change, int room) {
        this.change = change;
        this.room = room;
    }

    void announce1() {
        System.out.println("hh");
    }

}

public class Main1 {
    public static void main(String[] args) {
        Express express = new Express(new Changeable(30,4,50000), 5);
        System.out.println(express.busStop);
    }

}

























