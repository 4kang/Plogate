package lesson3;

public class Main {

	public static void main(String[] args) {
		
		//メソッドの呼び出し
		hello();
		strRail();
		strMain();
		strName1("なのか",300);
		strName2("丹恒",500);
		
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
	
	public static void strName1(String name,int hp) {
		System.out.println(name + "さんのHPは" + hp);
	}
	
	public static void strName2(String name,int hp) {
		System.out.println(name + "さんは風属性");
		System.out.println("HPは" + hp);
	}

}
