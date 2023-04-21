package lesson2;

public class For {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i = 1;i <= 10; i++) {
			System.out.println(i + "回飛びました");
		}
		
		System.out.println("＝＝＝break＝＝＝");
		
		//break
		for(int i = 1;i <= 10; i++) {
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("＝＝＝continue＝＝＝");
		
		//continue
		for(int i = 1;i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
