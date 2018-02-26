package com.jieun.s1;

public class ObjectTest {

	public static void main(String[] args) {
		Object	obj = new Object();
		Object obj2 = new Object();
		//obj객체와 obj2객체가 같은가? -> 다름
		//obj==obj2와같음
		boolean result = obj.equals(obj2); // boolean타입을 리턴
		//obj의 값과  obj2와의 값이 다르므로 fasle 출력
	String s  = obj.toString();
	System.out.println(s);
	System.out.println(obj);
	//참조변수를 프린트하면
	//내부에서 해당클래스의 toString 이라는 메서드가 자동으로 호출된다
	int i = obj.hashCode();
	System.out.println(i);
	
	}

}
