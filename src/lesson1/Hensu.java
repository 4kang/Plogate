package lesson1;

public class Hensu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num = 12;
		System.out.println(num);
		
		String tex = "Ruby";
		System.out.println(tex);
		
		//変数更新
		num = 200;
		tex = "Java";
		System.out.println(num);
		System.out.println(tex);
		
		
		//自己代入
		int x = 3;
		x = x + 2;
		
		System.out.println(x);
		
		
		//簡略計算 += -= *= /=
		num += 45;
		System.out.println(num);
		
		
		//変数の役割
		int height = 8;
		int weight = 6;
		int areaTore = height * weight;
		System.out.println(areaTore);
		
		
		//double型(小数)
		double num2 = 5.28;
		double num3 = 2.5;
		
		System.out.println(num2 + num3);
		
		
		

	}

}
