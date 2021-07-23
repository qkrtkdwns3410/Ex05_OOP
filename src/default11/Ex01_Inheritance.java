package default11;

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
default11.GrandFather >> default11.Father >> default11.Child
상속관계 .....

default11.Child child =  new default11.Child(); >> 상속관계에서는 부모부터 무조건 올라갑니다 >> 할아버지 >> 아버지 >> 아들


 */
//제일 최상위의 조상클래스가 Object 클래스의 문법을 계승합니다.
class GrandFather {
    public GrandFather() {
        System.out.println("default11.GrandFather");
    }

    public int gmoney = 5000;

    private int pmoney = 1111; //상속관계 접근 불가능 ( 객체 접근 불가 )

}

class Father extends GrandFather {

    public Father() {
        System.out.println("default11.Father");
    }
    public int fmoney = 3000;
}

class Child extends Father {

    public Child() {
        System.out.println("default11.Child");
    }
    public int cmoney = 1000;
}
//사용자(개발자)가 만드는 모든 클래스 default로  >> Object라는 최상위 클래스를 상속합니다.
class Car extends Object{ //Object클래스 상속이 생략되어있습니다.. >>

}
//여러분이 빈 클래스를 만들어도 최소한 Object가 가지는 public 자원을 사용이 가능합니다.


public class Ex01_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.gmoney);
        System.out.println(child.fmoney);
        System.out.println(child.cmoney);

        Car car = new Car();

    }

}

























