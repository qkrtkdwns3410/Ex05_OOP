package default11;

/*
[ 다형성 ]
Java : [ 상속관계 ]에서 [ 하나의 참조변수 ] 가(부모객체)가 [ 여러 개의 다른 타입 ]을 가질 수 있습니다.
[하나의 참조변수] >> 부모객체
[여러개의 다른 타입] >> 부모를 상속한 자식 객체

부모 클래스 타입의 참조변수가 여러개의 자식클래스 주소를 가질 수 있다.
 */
class Tv2 {
    boolean power;
    int ch;

    void power() {
        this.power = !this.power;
    }

    void chUp() {
        this.ch++;
    }

    void chDown() {
        this.ch--;
    }

}

class CapTv extends Tv2 {
    //특수화 , 구체화 자원 구현 >> 자막기능
    String text;

    String captionText() { //자막 기능 ON..
        return this.text = "현재 자막 처리중 ....";
    }

}

class PowerTv extends Tv2 {
    @Override
    void power() {
        super.power();
    }

    @Override
    void chUp() {
        super.chUp();
    }

    @Override
    void chDown() {
        super.chDown();
    }

}

public class Ex10_Inherit_poly {
    public static void main(String[] args) {
        CapTv capTv = new CapTv();
        capTv.power();
        System.out.println("전원 : " + capTv.power);

        capTv.chUp();
        System.out.println("채널 : " + capTv.ch);

        System.out.println(capTv.captionText());
        //기존 배운 내용.
        System.out.println("---------------------------------------------------------------");

        //원칙적으로 타입이 같지않다면 할당은 불가능합니다.
        /*
        상속관계에서 [부모타입] 은 [자식타입]의 [주소]를 가질 수 있다 (다형성)
        조건 : 단,, 부모는 자식의 자원만 접근 할 수 있습니다.
                  단. 재정의는 제외합니다.

         */
        Tv2 tv2 = capTv;//업캐스팅 >> 자동형변환 >>자손-> 조상
        System.out.println(tv2); //default11.CapTv@1b6d3586
        System.out.println(capTv); //default11.CapTv@1b6d3586
        tv2.power(); //자신의 타입 객체만 접근이 가능합니다.
        Tv2 tv3 = new PowerTv();


    }

}

























