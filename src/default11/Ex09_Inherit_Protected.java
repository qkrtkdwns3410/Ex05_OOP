package default11;

import kr.or.bit.Bird;


//Bird 상속받아서
//Protected 참조변수에서는 접근이 안됩니다. >> 상속관계에서는 접근이 가능합니다.

class Bi extends Bird {

    @Override
    protected void moveFast() {
        super.moveFast();
    }

}

class Ostrich extends Bird { //타조
    //구체화 특수화..
    void run() {
        System.out.println("run....");
    }

    @Override
    protected void moveFast() {//확장은 가능한데 축소는 불가능.
        run();
    }

}
public class Ex09_Inherit_Protected {
    public static void main(String[] args) {

        Bi bi = new Bi();
        bi.moveFast();
        bi.fly();
        System.out.println("---------------------------------------------------------------");

        //상속관계가 아니라면 default >> 같은 폴더내에서만 사용가능합니다.
        //사용하고 싶다면 재정의를 해야합니다... >> 상속관계에서는 public 입니다.

        Ostrich os = new Ostrich();
        os.run();
        os.moveFast();
    }

}

























