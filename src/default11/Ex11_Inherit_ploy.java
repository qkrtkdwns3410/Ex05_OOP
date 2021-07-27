package default11;

class Pbase {
    int p = 100;
}

class Cbase extends Pbase {
    int c = 200;
}

class Dbase extends Pbase {

}
public class Ex11_Inherit_ploy {
    public static void main(String[] args) {
        Cbase cbase = new Cbase();
        System.out.println(cbase.toString());

        Pbase p = cbase; //다형성
        System.out.println("부모의 주소값 : " + p); //same..

        Dbase dbase = new Dbase();
        p = dbase; //다형성
        System.out.println("부모의 주소값 : " + p); //same..

        System.out.println("---------------------------------------------------------------");
        //주의 사항
        Cbase c = (Cbase) p;//다운캐스팅 >> 조상 -> 자손 불가능합니다...(부모타입은 자식타입보다 상위타입입니다)..
        //부모 객체의 주소를 다시 자식에게 줄때는 >>자식타입이 하위타입이기 때문에 자식타입으로 >> casting 해야합니다.


    }

}

























