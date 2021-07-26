package kr.or.bit;

public class Program {
    public static void main(String[] args) {
        Pclass pc = new Pclass();
        pc.k = 10;
        pc.p = 11;
        //결국 protected 활용 상속....
        Bird b = new Bird();
        b.moveFast();
    }
}

























