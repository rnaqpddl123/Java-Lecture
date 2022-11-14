package ch06;

/**
 * Tmoney card
 *
 * - 10000원 카드 구매 - 1회에 요금 1350원 빠져나감 - 금액이 마이너스가 되면 안된다. 잔액이 1000원이라고 하면 사용할 수
 * 없음 - 금액을 재충전해야 한다.
 */
public class Ex13_Tmoney {

	public static void main(String[] args) {
		Tmoney card = new Tmoney(13500);
		
		while(true) {
			if(!card.ride()) {
				System.out.println("잔액부족");
				break;
			}
			System.out.println(card.cash);
		}
		
		// 충전
		card.charge(10000);
		System.out.println("현재잔액 = "+card.cash);

	}

}

class Tmoney {
	int cash;
	
	//금액확인
	Tmoney(int cash){
		this.cash = cash;
	}
	//요금빠져나감
	boolean ride() {
		if (this.cash>=1350) {
			this.cash -= 1350;
			return true;
		}
		return false;		
	}
	// 충전
	void charge(int cash) {
		this.cash +=cash;
	}
	
	
}
	
	
	
