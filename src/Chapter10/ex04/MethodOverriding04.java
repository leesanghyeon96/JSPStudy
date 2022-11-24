package Chapter10.ex04;

class A {
	protected void abc() {}		//메소드의 접근 지정자 : protected 
}
class B extends A{
	@Override
	public void abc() {}		//public은 부모 메소드의 접근지정자 protected 보다 넓다.
								//public, protected
}
class B2 extends A {
	@Override
	protected void abc() {}
}
class B3 extends A {
	//@Override
	//void abc() {}				//default
}
class B4 extends A {
	//@Override
	//private void abc() {}		//private
}


public class MethodOverriding04 {

	public static void main(String[] args) {
		// 메소드 오버라이딩과 접근지정자와의 관계
		//	- 부모의 메소드를 자식에서 재정의 해서 사용.
		//	- 부모의 메소드 이름과 동일, 시그니쳐도 동일
		//	- 부모의 접근지정자보다 오버라이딩할 자식 메소드는 접근지정자가 부모와 같거나 범위가 넓어야 한다.
		//	- public, protected, default, private 
		
		
	}

}
