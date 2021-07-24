package default11;

/*
public은 접근제한이 없는 접근 제어자입니다
default 가 붙으면 , 같은 패키지 내에서만 접근이 가능합니다
지역변수 >> 접근제어가 붙을 수 없음
    >> 접근제어자가 사용될 수 있는 곳 - 클래스 ,  멤버변수 , 메서드 , 생성자
protected >> 같은 패키지안과 다른 패키지의 자손클래스에서

 */
class SutdaCard {
    final int NUM;
    final boolean IS_KWANG;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }
    public String toString() {
        return NUM + ( IS_KWANG ? "K":"");
    }
}



























