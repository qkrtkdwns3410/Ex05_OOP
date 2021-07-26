package default11;

/*

 */

import kr.or.bit.Emp;

class Test2 {
    int x = 100;

    void print() {
        System.out.println("부모함수 Test2");
    }

}

class Test3 extends Test2 {
    int x = 300; //C# : 부모무시하기.. 라는

    @Override
    void print() {
        System.out.println("자식이 부모의 함수를 재정의합니다.");
    }

    //OverLoading ... (하나의 이름으로 여러가지 기능을 수행합니다)
    void print(String str) {
        System.out.println("나 오버로딩이야 ..."+str);
    }

}

public class Ex05_Inherit_Override {
    public static void main(String[] args) {
        Emp emp = new Emp(1000, "홍길동");
        System.out.println(emp.toString()); //Object의 toString()을 오버라이드했습니다.
        //참조변수 emp를 출력하면 complier가 뒤에 toString()을 넣어서 출력합니다 >>

        Test3 t3 = new Test3();
        System.out.println(t3.x); //상속을 했으면 바뀐값으로 인정되고 부모의 값을 인정 X

        t3.print(); //함수의 재정의를 통한 재사용...
        System.out.println("---------------------------------------------------------------");
        t3.print("하이");
    }

}

























