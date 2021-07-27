package default11;

/*

시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다

시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다

1차 코드 (물건이 3개 ...구매할 수 있는 함수)

************************************************************

1차 오픈 (제품 3개 ... 구매)

매장에 제품 1000개 (마우스 , 토스트기 , ...) 제품등록(POS 시스템)
매장에 1000개 제품 전시
고객 >> 고객불만 >> 제품을 3개밖에 구매....... >> 3종류 제품밖에 판매 >> 나머지 997개는 판매를 못했습니다... ㅠㅠ

변화에 대응하는 코드...
>>

*************************************************************

*/
class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class Kttv extends Product {

    public Kttv() {
        super(500);
    }

    @Override
    public String toString() {
        return "KtTv";
    }

}

class Audio extends Product {

    public Audio() {
        super(100);
    }

    @Override
    public String toString() {
        return "Audio";
    }

}

class NoteBook extends Product {

    public NoteBook() {
        super(150);
    }

    @Override
    public String toString() {
        return "NoteBook";
    }

}

//구매자
class Buyer {
    int money = 1000;
    int bonusPoint;

    //구매자는 구매행위를 할 수 있다. (기능)
    //구매행위 (잔액 - 제품의 가격 , 포인트 정보 갱신(증가))
    //*****************구매자는 매장에 있는 모든 물건을 구매할 수 있다.

    /*
    2차 개선
    코드의 중복을 제거해야합니다.

    한 개의 함수가 모든 전자제품의 구매 행위가 가능
    다형성 : 부모타입의 참조 변수는 자식객체의 주소를 받을 수 있다.
    단 부모는 자신의 것만 접근 (자식의 것은 볼 수 없다)
    단 부모것을 자식이 [재정의 했다면] ,... 그놈은 볼 수 있다.
     */
    void Buy(Product p) { //구매하려는 물건의 정보가 필요합니다.
        if (this.money < p.price) {
            System.out.println("잔액이 부족합니다.");
        } else {
            //실 구매행위.
            this.money -= p.price;
            this.bonusPoint += p.bonusPoint;
            System.out.println("구매한 물건은 : " + p);
        }
    }


}

public class Ex12_Inherit_KeyPoint {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();
//        Product p = new Audio();
//        buyer.Buy(p);
//        buyer.Buy(new Kttv());
        buyer.Buy(new NoteBook());

    }

}

























