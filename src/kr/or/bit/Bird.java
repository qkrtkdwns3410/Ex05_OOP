package kr.or.bit;

//새 (공통 일반 추상) >> 새는 날수 있다 . 새는 빠르다.
public class Bird {
    public void fly() {
        System.out.println("flying");
    }

    //설계자
    //설계도를 상속하는 당신은 특정 함수에 대해서 재정의를 했으면 좋겠는데...
    protected void moveFast() {
        fly();
    }

}

























