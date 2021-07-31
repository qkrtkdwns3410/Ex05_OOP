package default11;

import kr.or.bit.Singleton;

public class Ex14_SingleTon_main {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        System.out.println(s);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        Singleton s3 = Singleton.getInstance();
        System.out.println(s3);
        Singleton s4 = Singleton.getInstance();
        s4.setCh(7);
        System.out.println(s.getCh());
        System.out.println(s2.getCh());
        System.out.println(s3.getCh());
        //모든 객체의 주소는 동일합니다 ...
    }

}

























