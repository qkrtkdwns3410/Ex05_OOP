package default11;

/*
this : 객체 자신을 가리키는 this(  this.empno  ,  this.ename  )
this : 생성자를 호출하는 this (   this(100,"red")   )

상속

부모(base)

자식(this)

super ( 상속관계에서 부모 객체의 주소 ) : 상속관계에서 부모자원에 접근..

1. super >> 상속관계에서 자식이 부모의 접근 주소
2. super >> 상속관계에서 부모의 생성자를 호출할 수 있음 (명시적)

Tip)
C# : base()
Java : super()

 */
class Base {
    String baseName;

    public Base() {
        System.out.println("Base 기본 생성자 함수");
    }

    public Base(String baseName) {
        this.baseName = baseName;
        System.out.println("basename : " + this.baseName);
    }

    void method() {
        System.out.println("나는 부모 함수 ^^");
    }

}

class Derived extends Base {
    String dName;

    public Derived() {
        System.out.println("Derived 기본 생성자 함수");
    }

    public Derived(String dName) {

        super(dName);//부모 생성자를 호출(상속관계)
        this.dName = dName;
        System.out.println("dname : " + this.dName);
    }

    @Override
    void method() {
        System.out.println("부모 함수를 재정의......");
    }

    //재정의 ( 오버라이딩 ) 가 되었다면 부모자원에 접근을 할 수 없습니다.

    //접근 방법 ( super ) >> 별도의 함수안에서
    void parent_method() {
        super.method();
    }
}

public class Ex06_Inherit_super {
    public static void main(String[] args) {
//        Derived d = new Derived();
        Derived d2 = new Derived("홍길동");
        d2.method(); //재정의된 메서드 호출.
        d2.parent_method(); //부모 메서드 호출.
    }

}

























