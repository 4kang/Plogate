package lesson2;

public class IF {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int x = 10;
		if(x == 10) {
			System.out.println("xは10です");
		}
		
		int y = 20;
		if(y < 30) {
			System.out.println("条件はtrue");
			System.out.println("yは30より小さい");
		}
		
		//else
		int num1 = 20;
		if(num1 < 30) {
			System.out.println("num1は30より小さい");
		}else {
			System.out.println("num1は30以上");
		}
		
		//elseif
		int num2 = 25;
		if(num2>=30) {
			System.out.println("num2は30以上");
		}else if(num2>20) {
			System.out.println("num2は20より大きく、30より小さい");
		}else {
			System.out.println("num2は20以下");
		}

	}

}
