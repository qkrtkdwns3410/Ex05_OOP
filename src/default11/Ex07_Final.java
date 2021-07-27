package default11;

import com.sun.org.apache.xerces.internal.impl.dv.ValidatedInfo;

/*
변수 <---> 상수
상수 : 초기화가 되고 나서(최초값 할당)이 되면 변경이 불가
상수자원 : 고유값(주민번호) , 수학 (PI=3.141592) , 소프트웨어 버전 번호 , 시스템번호)
상수는 관용적으로 대문자

java : final int NUM=0;
c#  : const integer NUM=0;
final class Math {} >> 상속금지 >> 설계도 (상속 안돼 1장) >> final class MyMap
final void print() { }  >> 상속관계에서 오버라이드를 금지합니다...

public static final jumin ; //객체간 공유자원 (변하지 않는)...

--public static final void print(){ } 별 의미가 없음..

 */
class Vcard {
    final String KIND = "Clover"; //초기화안됨...
    final int NUM = 10;

    void method() {
        System.out.println(Math.PI);
    }
}

class Vcard2 {
    final String KIND;
    final int NUM;

    //생성자 호출로 final에게 반드시 초기화되어야함을 표현.
    Vcard2() {
        this("heart", 10);
    }

    public Vcard2(String KIND, int NUM) {
        this.KIND = KIND;
        this.NUM = NUM;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
public class Ex07_Final {
    public static void main(String[] args) {

        Vcard v = new Vcard();
        System.out.println(v.KIND);
        System.out.println(v.NUM);
        v.method();
        System.out.println("---------------------------------------------------------------");

        Vcard2 v2 = new Vcard2("spade", 7);
        System.out.println(v2.toString());
    }

}

























