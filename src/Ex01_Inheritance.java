/*
OOP
1. 상속
2. 캡슐화  ^^ private >> getter  , setter
3. 다형성

1. 상속
java >> child extends Base
C#   >> child : Base

2. 특징
2.1 다중 상속은 불가능합니다.
2.2 단일 상속 원칙
2.3 다중 상속을 지원합니다 (단 interface)

3. 상속
3.1 진정한 의미 : 재사용성
3.2 단점 : 초기 설계 비용 (추상화 : 공통분모)
3.3 장점 : 재사용성을 통해서 시간이 지날 수록 빠르게 진행가능..

4. 상속관계
GrandFather >> Father >> Child
상속관계 .....

Child child =  new Child(); >> 상속관계에서는 부모부터 무조건 올라갑니다 >> 할아버지 >> 아버지 >> 아들


 */
class GrandFather {
    public int gmoney = 5000;
}

class Father extends GrandFather{
    public int fmoney = 3000;
}

class Child extends Father{
    public int cmoney = 1000;
}
public class Ex01_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println();
    }

}

























