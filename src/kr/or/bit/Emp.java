package kr.or.bit;

public class Emp {  //Emp extends Object가 생략되어 있습니다..
    private int empno;
    private String ename;

    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

//    @Override
//    public String toString() {
//        return "사원정보: " + this.empno + " ,  " + this.ename;
//    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                '}';
    }

    //Object toString() 그대로 사용하면 주소값을 출력하도록 ...
    //개발자가 필요에 따라서는 재정의 .... 사용한다 .. 빈도가 높음...
    //자원의 정보를 확인하려는 형태로 재정의합니다.

}

























