package ch7_OOP;

class Earth {
	String sea;
	String land;
	
	void sunrise() {
		System.out.println("해가 떴습니다!");
	}
}

class Korea extends Earth {   
	String seoul;
	
	void sayHi() {  
		System.out.println("한국말로 '안녕하세요'");
	}
}

class Gangnam extends Korea { 
	void playMusic() {  
		System.out.println("강남스타일~");
	}
}

public class Ch7_Trans2 {

	public static void main(String[] args) {
		// 손자 -> 조상 형변환
		Gangnam g = new Gangnam();
		g.playMusic(); // OK 
		g.sayHi(); // OK 
		g.sunrise(); // OK
		
		Earth e = (Earth)g; 
//		e.playMusic(); // 에러 
//		e.sayHi(); // 에러 
		e.sunrise(); // OK 
		
		g = null; 
//		g.playMusic(); // 에러. NullPointerException
		e.sunrise(); // OK
		
		
		// 조상 -> 손자 형변환
		Earth e2 = new Earth(); 
		
		Gangnam g2 = (Gangnam)e2; 
		g2.playMusic();
		 
		
		
	}

}