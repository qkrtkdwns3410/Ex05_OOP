package default11;

import com.sun.media.jfxmedia.events.PlayerEvent;

/*
설계도

 */
class Tv {
    boolean power; //false
    int ch; //0

    void power() {
        this.power = !this.power; //false >> true //호출만하면 트루 false가 바뀝니다.
    }

    void chUp() {
        this.ch++;
    }

    void chDown() {
        this.ch--;
    }

}

class Vcr { //비디오 플레이어
    boolean power;

    void power() {
        this.power = !this.power;
    }

    void play() {
        System.out.println("재생하기");
    }

    void stop() {
        System.out.println("멈춤");
    }

    void rew() {}
    void ff(){}
}

/*
Tv 설계도
Vcr 설계도

요구사항 : TvVcr 이라는 제품

1.class TvVcr extend Tv ,Vcr (x) >> 다중 상속의 금지 >> 문법적인 측면의 Complie Error
2.class Tv extends Vcr  >>   TvVcr extends Tv  >> 문법 계층적 상속......
    >>  자원이름 충돌 ( 어떤 객체는 기능 사용이 불가능합니다 )

해결 : 한놈은 상속하고 한놈은 포함 ... >>
class TvVcr extends

1. Tv 상속 , Vcr 포함... >> class TvVcr extends Tv{ Vcr vcr; }  >>
2. Tv 포함 , Vcr 상속... >> class TvVcr extends Vcr{ Tv tv; }   >>
3. class TvVcr { Tv tv , Vcr vcr } >> TvVcr 은 Tv를 포함하고 , Vcr도 포함한다.

기준  :   주기능  ,   메인기능  >>   둘 중에 비중   >>   비중이 높은 클래스를 (상속)  >> 나머지 포함..
 */
class TvVcr extends Tv {
    Vcr vcr; //있어야합니다 (TvVcr 만들어지면 Vcr 생산 무조건)

    public TvVcr() {
        vcr = new Vcr();
    }

}

public class Ex03_Inherit {
    public static void main(String[] args) {
        TvVcr t = new TvVcr();
        t.power();
        System.out.println("전원 : " + t.power);

        t.chUp();
        System.out.println("채널 : " + t.ch);

        //비디오
        t.vcr.power(); //다른 메모리에 존재하기에.. 코드사용....
        System.out.println("비디오 전원 : " + t.power);
        t.vcr.power();
        t.power();
        System.out.println("Vcr 전원  : "+t.vcr.power);
        System.out.println("Tv 전원  : "+t.power);
    }

}

























