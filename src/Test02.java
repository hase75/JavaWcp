
public class Test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = "keigo";
		System.out.println(str);
		
		str = "ありがとう";
		System.out.println(str);
		
		final int number = 7;
		System.out.println(number);
		
		long long1 = 10000000000L;
		System.out.println(long1);
		
		double double1 = 3.14;
		System.out.println(double1);
		
		boolean boolean1 = true;
		System.out.println(boolean1);
		
		Integer a = 100;
		System.out.println(a);
		
		Float b = 1.4142f;
		System.out.println(b);
		
		Character c = 'う';
		System.out.println(c);
		
		int val = 2 + 5;
		System.out.println(val);
		
		val++;
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
		
		int distance = 100;
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String week = "Sunday";
		switch (week) {
		case "Sunday":
			System.out.println("日曜日です");
			break;
		case "Monday":
			System.out.println("月曜日です");
			break;
		case "Tuesday":
			System.out.println("火曜日です");
			break;
		case "Wednesday":
			System.out.println("水曜日です");
			break;
		case "Thursday":
			System.out.println("木曜日です");
			break;
		case "Fraiday":
			System.out.println("金曜日です");
			break;
		case "Saturday":
			System.out.println("土曜日です");
			break;
		default:
			System.out.println("曜日ではありません");
		}
		
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
