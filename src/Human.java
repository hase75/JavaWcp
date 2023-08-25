
public class Human {
	private String name;
	private int age; 

	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public void hello() {
		System.out.println("こんにちわ。私の名前は" + name + "です。" + age + "歳です");
	}

	public static void main(String[] args) {
		
		Human taro = new Human("太郎", 24);
		taro.hello();
		
		Human hanako = new Human("花子", 30);
		hanako.hello();
	}
}