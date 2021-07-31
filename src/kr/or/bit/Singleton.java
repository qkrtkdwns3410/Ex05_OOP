package kr.or.bit;

import default11.SystemSpeaker;
import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

/*
디자인 패턴 ( 생성 패턴 )  >> new 객체
싱글톤 패턴 : 객체 하나를 만들어서 공유 ....
하나의 객체를 가지고 사용하겠습니다....  new 를 못하게 하겠다.

활용
공유 프린터
공유 와이파이

수업 (JDBC)
 */
public class Singleton {

    static private  Singleton s;
    private  int ch;

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    private Singleton() { //기본 생성자      (   외부에서 new를 통한 객체 생성이 불가능합니다   )

    }
    public static Singleton getInstance() {
        if (s == null) { //아직 메모리를 갖지 않았다면 ..
            s = new Singleton();//객체를 생성합니다. >> 외부에서 접근이 getInstance로 가능합니다. >> heap에 올라갑니다.
        }
        return s;

    }



}
/*
SingleTon singleton = new SingleTon(); >> 가능여부 (불가능합니다)

1. static :: 객체 생성없이 사용가능합니다. ( new 하기전에 메모리에 올라갑니다 )
2. 생성자 개념 ( new 할때 호출되는 함수 )
3. private .. public 과의 관계 (클래스 내부에서의... 근데 클래스 내부에서는 private이든 public 이든 상관이 없습니다.)


 */

























