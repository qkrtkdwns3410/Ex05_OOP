package default11;

/*
실무 개발 환경 (현업)
설계도 1장은 연습하는거 말고는 없습니다.

설계도가 많습니다 ( 업무가 복잡하다 )  >> 하나의 설계도로 만드는 것은 불가능합니다. >> 규칙에 맞게 여러개의 설계도
쇼핑몰 >> 회원관리 , 배송관리  , 주문관리  , 상품관리 ,  관리자 .... (유식하게 >> 도메인이라고 부른다고 합니다.)  >> 각각의 설계도를 만듬.

배송  회원  ,  상품

고민 : 여러 개의 설계도를 어떤 기준에서 나누고 합치고 작업을 할 것이냐??

학자의 정의 ... 업무 지식이 없더라도 업무가 가능하게.... 잣대...
1. is ~ a : ~은 ~이다. > 상속관계로 하면 대충맞습니다.
2. has ~ a  > 은 ~가지고 있다 > 포함

예)
원       도형              관계
원은     도형이다 (0)
원은      도형을         가지고 있다 (X)
>> 원 Extends 도형

원          점            관계
원은        점이다 (X)
원은          점을 가지고 있다(O)
>>class  원   {점  (부품)  }

경찰      권총
경찰은 권총이다 X
경찰은 권총을 가지고 있다 (O)
class 권총 {}
class 경찰{
    void 출동 (권총) {

    }
}

예 ) 원 , 삼각형 , 사각형 만드는 설계도를 작성하세요.

원은 도형이다
삼각형은 도형이다
사각형은 도형이다.

도형 : 추상화 , 일반화 >> 공통자원 ( 분모 )  >> 그리다 , 색상 ,
원    :  구체화 , 특수화 >> 원만이 가지는 특징 >> 반지름 , 한 점(좌표값)

class Shape {색상 , 그리다}
class Point {x,y}

원은 점을 가지고 도형이다.

원 extends Shape {
    Point (부품)
}


 */
class Shape {
    String color = "gold";
    void draw() {
        System.out.println("그리다");
    }
}

class Point {
    int x;
    int y;

    //x , y 기본값이 있고
    public Point() {
        this(1, 1); //this로 생성자를 호출합니다.!!
    }
    //필요에 따라서는 입력 받고 싶다.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
//원을 ....(원의 정의는 한점과 반지름을 가지고 있다)
//1. 원은 도형이다
//2. 원은 점을 가지고 있다 (member field : 부품 타입)
//3. 원은 반지름을 가지고 있습니다. (특수성) r (member field : 부품 타입)

class Circle extends Shape {
    Point point; //포함(부품 타입)
    int r; //원의 구체화 , 특수성

    Circle() {
        this(new Point(10, 20), 10);
    }

    Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

}




public class Ex02_Inherit_Composition {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.r);
        System.out.println(circle.point.x);
        System.out.println(circle.point.y);

        circle.draw();

        System.out.println(circle.color);
        System.out.println("---------------------------------------------------------------");
        Circle circle1 = new Circle(new Point(1, 5), 50);

        System.out.println("반지름 : " + circle1.r);
        System.out.println("x 좌표 : " + circle1.point.x);
        System.out.println("x 좌표 : " + circle1.point.y);
        circle1.draw();
        System.out.println("색상 : " + circle1.color);
    }

}

























