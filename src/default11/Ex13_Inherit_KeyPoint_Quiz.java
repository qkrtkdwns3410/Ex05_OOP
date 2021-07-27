/*

문제 풀어 보세요 ^^

요구사항

카트 (Cart)

카트에는 매장에 있는 모든 전자제품을 담을 수 있다
카트의 크기는 고정되어 있다 (10개) : 1개 , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다
계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력
hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 )
hint) Buyer ..>> summary() main 함수에서 할떄
구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다

*/

package default11;


/*
    2차 개선
    코드의 중복을 제거해야합니다.

    한 개의 함수가 모든 전자제품의 구매 행위가 가능
    다형성 : 부모타입의 참조 변수는 자식객체의 주소를 받을 수 있다.
    단 부모는 자신의 것만 접근 (자식의 것은 볼 수 없다)
    단 부모것을 자식이 [재정의 했다면] ,... 그놈은 볼 수 있다.
     */
class Product3 {
    int price;
    int bonusPoint;

    public Product3(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }



}

class KtTv extends Product4 {
    KtTv() {
        super(500);
    }
}

public class Ex13_Inherit_KeyPoint_Quiz {
    public static void main(String[] args) {

    }

}



















































