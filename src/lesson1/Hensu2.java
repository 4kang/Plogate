package lesson1;

public class Hensu2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//自己代入
		int x = 3;
		System.out.println(x);
		
		x = x + 2;
		System.out.println(x);
		
		
		//自動型変換
		int month = 8;
		int date = 27;
		System.out.println(month + "月" + date + "日");
		
		
		//強制型変換
		int num1 = 13;
		int num2 = 4;
		System.out.println(num1/num2);
		
		// num1をdouble型にキャストし、num2で割った値を出力してください
		System.out.println((double)num1/num2);

	}

}
