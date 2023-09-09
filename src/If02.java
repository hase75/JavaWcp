
public class If02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		} else if (number < 10) {
			System.out.println(number + "は5以上10未満です");
		} else if (number < 15) {
			System.out.println(number + "は10以上15未満です");
		} else {
			System.out.println(number + "は15未満でないです");
		}
		
		int number2 = 100;
		if (number2 <= 50) {
			System.out.println(number2 + "は50未満です");
		} else if (number2 <= 100) {
			System.out.println(number2 + "は50以上100未満です");
		} else if (number2 <= 150) {
			System.out.println(number2 + "は100以上150未満です");
		} else {
			System.out.println(number2 + "は150未満ではないです");
		}
	}

}
