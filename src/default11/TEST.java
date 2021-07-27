package default11;/*

문제 풀어 보세요 ^^

요구사항

카트 (Cart)

카트에는 매장에 있는[ 모든 전자제품 ]을 담을 수 있다 

카트의 [크기는 고정]되어 있다 (10개) : 1개 , 2개 담을 수 있고 [최대 10개]까지 담을 수 있다

고객이 물건을 [구매 ]하면 ... [카트에 담는다]



계산대에 가면 전체 계산

[계산기능]이 필요

summary() 기능 추가해 주세요

당신이 구매한 물건이름 과 가격정보 나열

총 누적금액 계산 출력



hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 )

hint) Buyer ..>> summary() main 함수에서 계산할때



--구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다



Ex12 그대로 가져다가 카트 와 계산기능만 추가 ....

*/

class Product4 {

    int price;
    int bonuspoint;

    Product4(int price) {
        this.price = price;
        this.bonuspoint = (int) (this.price / 10.0);

    }

}


class KtTv3 extends Product4 {

    KtTv3() {
        super(500);
    }


    @Override

    public String toString() {
        return "KtTv3";
    }

}

class Audio3 extends Product4 {

    Audio3() {
        super(100);
    }


    @Override

    public String toString() {
        return "Audio3";
    }

}

class NoteBook3 extends Product4 {

    NoteBook3() {
        super(150);
    }


    @Override

    public String toString() {
        return "NoteBook3";
    }

}


//카드 , 계산 추가

class Buyer3 {

    int money;
    int bonuspoint;
    int index = 0;
    Product4[] cart;

    Buyer3() {
        this(1000, 0);

    }

    Buyer3(int money, int bonuspoint) {
        cart = new Product4[10];
        this.money = money;
        this.bonuspoint = bonuspoint;
    }


//구매기능안에 장바구니(cart) 넣는 기능 같이 포함하세요

    void Buy(Product4 product) {

        if (this.money >= product.price) {
            if (index >= 10) {
                System.out.println("장바구니가 꽉찼어요!");
                System.out.println("---------------------------------------------------------------");
                return;
            }
            System.out.println(product + "  구매완료");
            this.money -= product.price;
            this.bonuspoint += product.bonuspoint;

            cart[index++] = product;
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("잔액이 부족합니다..");
            System.out.printf("현재 잔액은 %d 입니다.", this.money);
            System.out.println("---------------------------------------------------------------");
        }



    }


//계산대 (장바구니)

//장바구니에 담긴 물건을 계산

//물건의 총액

//물건의 목록 출력

    void Summary() {
//코드 구현하세요************
        int pSum = 0;
        int pBonus = 0;

        System.out.println("장바구니 담긴 물건과 그 금액 출력");
        for (int i = 0; i < index; i++) {
            System.out.printf("%s, %d\n", cart[i], cart[i].price);
            pSum += cart[i].price;
            pBonus += cart[i].bonuspoint;
        }
        System.out.printf("물건의 총액:  %d , 현재 적립될 포인트: %d 입니다.\n", pSum, pBonus);
        System.out.println("＼＼＼＼＼＼＼＼＼|||||||||||||||||||||||||||||||／／／／／／／／／／／／／");
        System.out.println("-----고객님의 보너스 포인트는 " + bonuspoint + " 입니다.-------");
        System.out.println("／／／／／／／／／|||||||||||||||||||||||||||||||＼＼＼＼＼＼＼＼＼＼＼＼＼");
        System.out.println("---------------------------------------------------------------");
    }

}


public class TEST {


    public static void main(String[] args) {

        KtTv3 kttv = new KtTv3();
        Audio3 auido = new Audio3();
        NoteBook3 notebook = new NoteBook3();

        Buyer3 buyer = new Buyer3(10000, 0); //고객

        buyer.Buy(kttv);
        buyer.Buy(auido);
        buyer.Buy(kttv);
        buyer.Buy(kttv);
        buyer.Buy(notebook);
        buyer.Summary();

    }

}