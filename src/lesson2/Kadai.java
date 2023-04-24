package lesson2;

public class Kadai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] numbers = {1,4,6,9,13,16};
		
		int oddSum = 0; //奇数
		int evenSum = 0; //偶数
		
		// for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
		for(int num: numbers) {
			if(num % 2 == 0) {
				evenSum += num;
			}else {
				oddSum += num;
			}
		}
		
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");

	}

}
