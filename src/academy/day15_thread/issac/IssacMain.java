package day15_thread.issac;

public class IssacMain {
	public static void main(String[] args) {
		Issac issac = new Issac();
		
		Chief chief = new Chief(issac);
		
		Customer minwoo = new Customer(issac, 2, "민우");
		Customer jaehun = new Customer(issac, 5, "재훈");
		Customer cow = new Customer(issac, 3, "카우");
		
		chief.start();
		minwoo.start();
		jaehun.start();
		cow.start();
	}
}
