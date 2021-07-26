package default11;

/*
1. 오버로딩(Overloading)
- 메서드의 이름은 같고 매개변수의 갯수나 타입이 다른 함수를 정의하는 것을 의미한다.
- 리턴값만을 다르게 갖는 오버로딩은 작성 할 수 없다.

2. 오버라이딩(Overriding)
- over + ride =  먼가 위에서 (라이딩 한다)달린다???
- 상위 클래스의 메서드를 하위 클래스가 재정의 하는 것이다.
- 메서드의 이름은 물론 파라메터의 갯수나 타입도 동일해야 하며, 주로 상위 클래스의 동작을 상속받은 하위 클래스에서 변경하기 위해 사용된다.

즉,
오버로딩(Overloading)은 기존에 없던 새로운 메서드를 정의하는 것이고,
오버라이딩(Overriding)은 상속 받은 메서드의 내용만 변경 하는 것이다.
-----------------------------------------------------------------------------------------------------------------------------------------------
Today Point
>> [상속관계] 에서 override : 상속관계에서 자식이 부모의 함수를 재정의하는 것.
    재정의 : 틀의 변화는 없고 (함수의 이름 , 타입 , parameter) 내용만 변화 ...{괄호안만 바꾸는 것}
    [상속관계]에서 [자식클래스] 가 [부모 클래스]의 함수의 내용을 바꾼다  (재정의)


 */

class Point2 {
    int x = 4;
    int y = 5;

    String getPosition() {
        return this.x + " / " + this.y;
    }

}

class Point3D extends Point2 {
    //x , y , z
    int z = 6;

    /*
    1. 함수하나 새로만들던가
    2. 오버라이드를 하던가.. >> 부모의 함수를 재사용합니다. >> 재정의

    Annotation은 [ Java code만으로 전달할 수 없는 부가적인 정보 ]를 컴파일러나 개발툴로 전달할 수 있다.
    @Override annotation은 [ super class ]나 [ interface ]의[ method를 override하고 있음을 명시 ]한다

    */

    @Override
    String getPosition() { //오버라이드
        return this.x + " / " + this.y + " / " + this.z;
    }

}

public class Ex4_Inherit_Override {
    public static void main(String[] args) {
        Point3D point = new Point3D();

        String result = point.getPosition();
        System.out.println(result);
    }

}

























