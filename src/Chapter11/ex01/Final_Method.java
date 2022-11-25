package Chapter11.ex01;

class Aa{
	
	//생략된 생성자 출력
	Aa(){
		
	}
	
	void print() {
		System.out.println("Aa 클래스의 print() 메소드 입니다.");
	}
	
	//자식 클래스에서 재정의(오버라이딩 불가) 할 수 없도록 설정한 메소드 : 아주 중요한 메소드
	final void run() {
		System.out.println("Aa 클래스의 run() 메소드 입니다.");
	}
}

class Bb extends Aa{
	
	@Override
	void print() {
		System.out.println("Bb 클래스에서 오버라이딩 됨");
	}
	
	//생략된 생성자 출력 (아래의 기본 생성자가 생략되어있음)
	Bb (){
		super();	//부모의 기본생성자 호출
	}
	
//	@Override
//	void run() {}	자식에서 오버라이딩 불가
	
	
	
	
}


public class Final_Method {

	public static void main(String[] args) {
		
		
		Aa a1 = new Bb();
		a1.print();		//"Bb 클래스에서 오버라이딩 됨" 출력
		
	}

}
