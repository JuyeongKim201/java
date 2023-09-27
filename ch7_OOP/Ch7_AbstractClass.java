package ch7_OOP;

abstract class Player {
	boolean pause; // 일시정지 상태를 저장하기 위한 변수
	int currentPos; // 현재 play되고 있는 위치를 저장하기 위한 변수 
	
	Player(){ // 기본 생성자. 추상클래스도 생성자가 있어야 한다.
		pause = false;
	}
	
	/** 지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다. */
	abstract void play(int pos); // 추상 메서드 
	/** 지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다. */
	abstract void stop(); // 추상 메서드
	
	void play() {
		play(currentPos); // 추상 메서드를 사용할 수 있다. 
	}
}


class AudioPlayer extends Player {
	void play(int pos) { /* */ }
	void stop() { /* */ }	
}


public class Ch7_AbstractClass {

	public static void main(String[] args) {
//		Player p = new Player(); // Cannot instantiate 에러
		AudioPlayer ap = new AudioPlayer(); // OK
		Player p = new AudioPlayer();
	}
}
