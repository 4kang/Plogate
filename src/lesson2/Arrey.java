package lesson2;

public class Arrey {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("＝＝＝配列の作り方＝＝＝");
		
		int[] numbers = {5,13,29};
		String[] names = {"John", "Kate", "Bob",};
		
		System.out.println("私の名前は" + names[0] + "です");
		System.out.println("私の名前は" + names[1] + "です");
		System.out.println("私の名前は" + names[2] + "です");
		
		
		System.out.println("＝＝＝配列の要素を上書きする＝＝＝");
		
		System.out.println(names[0]);
		names[0] = "William"; //0番目の名前を上書き
		System.out.println("変更後の名前は" + names[0]);
		
		System.out.println(names[1]);
		names[1] = "メイ";
		System.out.println("変更後の名前は" + names[1]);
		
		
		System.out.println("＝＝＝繰り返し＝＝＝");
		
		for(int i = 0;i < 3;i++) {
			System.out.println("Hello" + names[i]);
		}
		
		for(int x = 0;x < names.length; x++) { 
			System.out.println("こんにちは" + names[x]);
		}
		
		
		System.out.println("＝＝＝拡張for文の文法＝＝＝");
		for(String name: names) {
			System.out.println("貴方の名前は" + name);
		}
				

	}

}
