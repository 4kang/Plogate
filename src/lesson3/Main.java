package lesson3;

public class Main {

	public static void main(String[] args) {
		
		//メソッドの呼び出し
		hello();
		strRail();
		strMain();
		strName1("なのか");
		strName2("丹恒");
		
	}
	
	public static void hello() {
		System.out.println("Hello World");
	}
	
	public static void strRail() {
		System.out.println("崩壊スターレイル楽しい");
	}
	
	public static void strMain() {
		System.out.println("主人公はやべぇやつ");
	}
	
	public static void strName1(String name) {
		System.out.println(name + "さんは氷属性");
	}
	
	public static void strName2(String name) {
		System.out.println(name + "さんは風属性");
	}

}
