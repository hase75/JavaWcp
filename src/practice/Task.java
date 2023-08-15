package practice;

public class Task {
	
	private int date;
	private String content;
	private boolean done = false;
	
	public Task(int date, String content) {
		
		this.date = date;
		this.content = content;
	}
	
	public void done() {
		System.out.println("タスク「 "+ content + "jを完了します。");
		done = true;
	}
	
	public void print() {
		if (done) {
			System.out.println(date + "のタスク「" + content + "jは完了しています。");
		} else {
			System.out.println(date + "のタスク「" + content + "jは未完了です。");
		}
	}
}
