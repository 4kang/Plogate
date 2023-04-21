package lesson2;

public class Switch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int n = 2;
		 
		switch(n) {
		case 1:
			System.out.println("大吉です");
			break;
		case 2:
			System.out.println("吉です");
			break;
		}
		
		//default
		int m = 0;
		
		switch(m) {
		case 1:
			System.out.println("大吉です");
			break;
		case 2:
			System.out.println("吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}

	}

}
