package default11;

import kr.or.bit.Pclass;

/*

private , default , public , [상속관계에서] protected >> 상속이 없으면 존재 X

protected : 박쥐... 어떨때는 default의 성격..  or public 의 성격..

>>상속이 없는 클래스 안에서 protected 접근자는 default와 같습니다.
>>결국에는 protected 는 상속관계에서만 의미를 가집니다.





 */
class Dclass {
    public int i;
    private int p;
    int s; //default
    protected int k; // >> default접근자와 똑같습니다. (일반적인 클래스에서는 사용할 이유가 없습니다)
}

class Child2 extends Pclass {
    @Override
    protected void method() {
        this.k = 100; //public
        System.out.println(this.k);
    }

}
public class Ex08_Inherit_Protected {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();
    }

}

























