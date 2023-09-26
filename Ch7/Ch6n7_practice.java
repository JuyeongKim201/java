package Ch7;
//cv, iv, lv 개념
//cm, im 개념
//기본형 매개변수와 참조형 매개변수
//오버로딩
//기본생성자, 매개변수 받는 생성자
//객체 배열 - 참조변수 연속 생성하기

public class Ch6n7_practice {

	public static void main(String[] args) {
		// g1 인스턴스 생성 (기본생성자)
		GAME g1 = new GAME();
		
		System.out.println("GAME 라운드: "+GAME.round);
		g1.win(10);
		System.out.println("GAME1 스코어: "+g1.score);
		
		System.out.println("------------------");
		
		// g2 인스턴스 생성 (기본생성자)
		GAME g2 = new GAME();
		
		System.out.println("GAME 라운드: "+GAME.round);
		g2.win(20);
		System.out.println("GAME1 스코어: "+g1.score);
		System.out.println("GAME2 스코어: "+g2.score);
		
		System.out.println("------------------");
		
		// g3 인스턴스 생성 (매개변수 생성자)
		GAME g3 = new GAME(50);
		
		System.out.println("GAME 라운드: "+GAME.round);
		g3.win(30);
		System.out.println("GAME1 스코어: "+g1.score);
		System.out.println("GAME2 스코어: "+g2.score);
		System.out.println("GAME3 스코어: "+g3.score);
		
		System.out.println("-------LOL 클래스-------");
		
		// 자식 클래스 LOL 인스턴스 생성 
		LOL l1 = new LOL(); // 이름은 다르지만 부모클래스의 기본생성자를 물려받음.
		System.out.println("GAME 라운드: "+GAME.round);   
		LOL l2 = new LOL();
		System.out.println("GAME 라운드: "+GAME.round);   
		
//		LOL l3 = new LOL(30); // 에러. 부모클래스의 매개변수생성자는 물려받지 않음. 
		
		l1.name = "김가네";
		System.out.println(l1.name);
		System.out.println(l2.name); // String의 기본값인 null 출력
		
	}

}


class GAME {
	static int round;
	int score;
	
	// 기본 생성자
	GAME(){ 
		score = 0;
		GAME.round += 1; // cv에 접근하여 값 조정
	}
	
	GAME(int settedScore){
		score = settedScore; 
		GAME.round += 1; // cv에 접근하여 값 조정
	}
	
	int win(int bet) {
		System.out.println("점수: "+score+" -> "+(score+bet));
		score += bet;
		return score;
	}
	
}

class LOL extends GAME {
	String name;
}
